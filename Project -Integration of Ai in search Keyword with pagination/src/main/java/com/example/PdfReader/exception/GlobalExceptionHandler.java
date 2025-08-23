package com.example.PdfReader.exception;

import com.example.PdfReader.Constants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<Map<String, Object>> handleApiException(ApiException ex) {
        Map<String, Object> error = new HashMap<>();
        error.put(Constants.ERROR, ex.getMessage());
        error.put(Constants.STATUS, ex.getStatus().value());
        return ResponseEntity.status(ex.getStatus()).body(error);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGenericException(Exception ex) {
        Map<String, Object> error = new HashMap<>();
        error.put(Constants.ERROR, Constants.SERVER_ERRPR + ex.getMessage());
        error.put(Constants.STATUS, 500);
        return ResponseEntity.status(500).body(error);
    }
}