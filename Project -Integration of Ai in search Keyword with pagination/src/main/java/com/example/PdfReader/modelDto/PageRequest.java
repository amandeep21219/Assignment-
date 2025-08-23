package com.example.PdfReader.modelDto;

import lombok.Data;

@Data
public class PageRequest {
    private int offset = 0;
    private int limit = 10;

}