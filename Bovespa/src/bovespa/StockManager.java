package bovespa;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.Stream;

public class StockManager {
	private int i = 0;
	private DateTimeFormatter dafuq = DateTimeFormatter.ofPattern("yyyyMMdd");

	public Stock[] loadStocks(String fileName) throws IOException {
		Stream<String> lines = Files.lines(Paths.get(fileName));
		Stock[] stocks = new Stock[(int) (lines.count() - 2)];
		lines = Files.lines(Paths.get(fileName));
		lines.forEach(string -> {
			if (string.startsWith("01")) {

				Stock stock = new Stock();
				stock.setCode(string.substring(12, 24));
				stock.setDate(LocalDate.parse(string.substring(2, 10), dafuq));
				stock.setMaxPrice(new BigDecimal(string.substring(61, 80) + "." + string.substring(80, 82)));
				stock.setOpenPrice(new BigDecimal(string.substring(56, 67) + "." + string.substring(67, 69)));
				stock.setClosePrice(new BigDecimal(string.substring(108, 119) + "." + string.substring(119, 121)));
				stock.setMinPrice(new BigDecimal(string.substring(82, 93) + "." + string.substring(93, 95)));
				stocks[i++] = stock;
				
			}
		});

		return stocks;
	}
}
