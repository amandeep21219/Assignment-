package com.example.PdfReader.Service;

import com.example.PdfReader.modelDto.SearchResponse;
import com.example.PdfReader.modelDto.UploadResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

public interface PdfService {

    UploadResponse uploadPdf(MultipartFile file);

    SearchResponse searchInUploaded(UUID fileId, String query, Boolean caseSensitive, Integer contextChars, Boolean useSemantic);

    SearchResponse uploadAndSearch(MultipartFile file, String query, Boolean caseSensitive, Integer contextChars, Boolean useSemantic);

}

