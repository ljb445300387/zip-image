package com.ljb.zip_image;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.Thumbnails.Builder;

public class Test {
	public static void main(String[] args) throws IOException {
		System.out.println(153);

		BufferedImage originalImage = ImageIO.read(new File("1.jpg"));

		Builder<BufferedImage> scale = Thumbnails.of(originalImage).scale(0.25f);
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		scale.outputFormat("png").toOutputStream(byteArrayOutputStream);
		byte[] byteArray = byteArrayOutputStream.toByteArray();
		System.out.println(byteArray.length);
		scale.toFile(new File("2.jpg"));
		
	}

}
