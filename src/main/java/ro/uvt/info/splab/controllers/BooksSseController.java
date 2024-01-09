package ro.uvt.info.splab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksSseController {
    @GetMapping("/book-sse")
    public String bookSse() {
        return "book-sse";
    }
}
