package sn.ksi.boutique.gestion_boutique.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dpj3hrs8c",
                "api_key", "852428774274873",
                "api_secret", "jbOqhHZjDwL4Y443QpVenz6IziY"
        ));
    }
}