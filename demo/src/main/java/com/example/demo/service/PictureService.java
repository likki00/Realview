package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Picture;
@Service
public class PictureService {
    public void save(Picture picture) {
		// repo
		// if save not successfull
		// throw error

	}

	public List<Picture> getPictures() {
		List<Picture> pics = new ArrayList<>();
		pics.add(new Picture());
		// repo
		return pics;
	}
}
