package ro.uvt.info.splab.services;

import ro.uvt.info.splab.models.Context;
import ro.uvt.info.splab.models.Paragraph;
import ro.uvt.info.splab.models.Strategy;

public class AlignRight implements Strategy {
    @Override
    public String render(Paragraph paragraph, Context context) {
        int maxWidth = 60;
        String text = paragraph.getText();

        if (text.length() >= maxWidth) {
            return text; // Text is longer than or equal to the specified width, no alignment needed.
        } else {
            int spacesToAdd = maxWidth - text.length();
            StringBuilder alignedText = new StringBuilder();
            for (int i = 0; i < spacesToAdd; i++) {
                alignedText.append(" ");
            }
            alignedText.append(text);
            return alignedText.toString();
        }
    }
}
