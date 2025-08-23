package com.example.PdfReader.pdfUtils;
import com.example.PdfReader.Constants;
import com.example.PdfReader.exception.ApiException;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import java.util.Objects;

@Component
public class FileValidators {

@SneakyThrows
    public  void validatePdfFile(MultipartFile file) {
        if (Objects.isNull(file) || file.isEmpty()) {
            throw new ApiException("File is required", HttpStatus.BAD_REQUEST);
        }
        if (!Constants.FILE_CONTENT.equals(file.getContentType())) {
            throw new ApiException("Only PDF files are allowed", HttpStatus.BAD_REQUEST);
        }
        if (file.getSize() > Constants.MAX_SIZE) {
            throw new ApiException("File size cannot exceed 10MB", HttpStatus.BAD_REQUEST);
        }
    }
}