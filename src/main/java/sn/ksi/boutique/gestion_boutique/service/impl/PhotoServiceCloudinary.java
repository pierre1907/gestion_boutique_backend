package sn.ksi.boutique.gestion_boutique.service.impl;

import org.springframework.stereotype.Service;
import sn.ksi.boutique.gestion_boutique.service.PhotoService;

@Service
public class PhotoServiceCloudinary implements PhotoService {

    @Override
    public String uploadPhoto(byte[] photoData) {
        return "url_photo_cloudinary";
    }
}