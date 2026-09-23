package util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.json.JsonMapper;

public class JSONMapper {
	private static final JsonMapper mapper= JsonMapper.builder().build();
	public static <T> void agregar(T object, Class<T> classs, String path) {
		
		try {
			List<T> list=obtener(classs,path);
			list.add(object);
			String json=mapper.writeValueAsString(list);
			Files.write(
	                new File(path).toPath(), 
	                json.getBytes(), 
	                StandardOpenOption.CREATE, 
	                StandardOpenOption.TRUNCATE_EXISTING
	            );
		} catch (IOException e) {
			System.out.println("Error al guardar la nomina: "+e.getMessage());
		}
		
	}
	
	public static <T> List<T> obtener(Class<T> classs, String path) {
		File archivo= new File(path);
        List<T> objects = new ArrayList<>();
        if(archivo.exists() && archivo.length() > 0) {
        	try {
				String content=Files.readString(archivo.toPath());
	            objects = mapper.readValue(content,
	                    mapper.getTypeFactory().constructCollectionType(List.class, classs));
				} catch (IOException e) {
				System.out.println("Error al leer: "+e.getMessage());
			}
        }
        return objects;
	}
	
}
