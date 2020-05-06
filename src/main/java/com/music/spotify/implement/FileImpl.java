package com.music.spotify.implement;

import com.music.spotify.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
@Service
public class FileImpl implements FileService {
    public static final String PATH_FILE = "/opt/lampp/htdocs/spotify/image/%s.jpg";

    @Override
    public void saveFilePicture(MultipartFile image, String id) throws IOException {
        File file = new File(String.format(PATH_FILE,id));
        file.createNewFile();
        try(FileOutputStream fileOutputStream = new FileOutputStream(file)){
            fileOutputStream.write(image.getBytes());
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
