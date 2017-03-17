package bovespa;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StockManager {

	public Stock[] loadStocks(String fileName) throws IOException{
		
			Files.lines(Paths.get(fileName));
		
		
		
		return null;
	}
}
