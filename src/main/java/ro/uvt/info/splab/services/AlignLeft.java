package ro.uvt.info.splab.services;

import ro.uvt.info.splab.models.Context;
import ro.uvt.info.splab.models.Paragraph;

public class AlignLeft implements AlignStrategy {
    @Override
    public String render(String text, int lineLength) {
        int length = text.length();
        StringBuilder result = new StringBuilder();
        int start = 0;
        while (start < length) {
            int end = Math.min(start + lineLength, length);
            result.append(text, start, end).append('\n');
            start = end;
        }
        return result.toString();
    }
}
