/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.dto;

import java.util.List;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Tapreward
 */
@Data
public class FileUploadBean {
    
    private List<MultipartFile> files;

    public List<MultipartFile> getFiles() {
        return files;
    }

    public void setFiles(List<MultipartFile> files) {
        this.files = files;
    }
    
    
    
}
