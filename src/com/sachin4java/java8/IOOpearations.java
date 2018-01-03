package com.sachin4java.java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IOOpearations {

	public static void main(String[] args) throws IOException {
		//list of files
		
			System.out.println("List of files");
			Files.list(new File("./src/com/sachin4java/java8/").toPath())
					.forEach(System.out::println);
		
			
			System.out.println("***List of files with max files and filter***");
			Files.list(new File("./src/com/sachin4java/java8/").toPath())
					.filter(p -> p.getFileName().toString().startsWith("F"))
					.limit(2)
					.forEach(System.out::println);

			
			System.out.println("***Read lines***");
			Files.list(new File("./src/com/sachin4java/java8").toPath())
					.forEach(p -> {
						
						try {
							if(p.getFileName().toString().startsWith("IOOpearations.java")) {
							Stream<String> stream = Files.lines(p);
							stream.forEach(System.out::println);
							}
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					});
			
			
			//Files.walk syntax
				/*public static Stream<Path> walk(Path start,
	            int maxDepth,
	            FileVisitOption... options)
	     		throws IOException*/
			
			System.out.println("****Using files.walk ****");
			Path p = Paths.get("./");
			try (Stream<Path> stream = Files.walk(p, 3)){
				stream.forEach(System.out::println);
			}
			
			
			//Files.find
			System.out.println("****Files.find*****");
			try (Stream<Path> paths = Files.find(
	                Paths.get("./src/"), Integer.MAX_VALUE,
	                (path,attrs) -> attrs.isRegularFile()
	                        && path.toString().endsWith("IOOpearations.java"))) {
	            // Consume only the first 5 from the stream:
	            paths.limit(Integer.MAX_VALUE).forEach(System.out::println);
	        }
			
			/*
			System.out.println("****Files.find*****");
			Path findPath = Paths.get("./");
			Files.find(findPath, 10, (path, attr)->{
				System.out.println("HJKHJGHGH");
				if(String.valueOf(path).equals("IOOpearations.java")) {
					System.out.println("IOOpearations.java found");
					return true;
					
				}else {
					System.out.println("Not Found");
					return false;
				}
			});*/
			
			//bufferedReader lines
			System.out.println("***Using bufferedReader lines**");
			try(BufferedReader br = Files.newBufferedReader(Paths.get("./src/com/sachin4java/java8/IOOpearations.java"))){
				List<String> list = br.lines().map(String::toUpperCase).collect(Collectors.toList());
				list.forEach(System.out::println);
			}
			
	}
	
	

}
