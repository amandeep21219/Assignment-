package com.example.PdfReader;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constants {
    public static final String STATUS= "status";
    public static final String ERROR="error";
    public static final String SERVER_ERRPR="server error";
    public static final String FILE_CONTENT="application/pdf";
    public static final Integer MAX_SIZE=10485760;
}
