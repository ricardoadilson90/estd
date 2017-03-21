package bovespaTest;

import java.io.IOException;

import org.junit.Test;

import bovespa.Stock;
import bovespa.StockManager;

public class StockManagerTest {
	
	@Test
	public void loadStocksTest() throws IOException{
		StockManager stockManager = new StockManager();
		Stock[] stocks = stockManager.loadStocks("Z:/3 ano/COTAHIST_A2016.txt");
		for(Stock stock : stocks)
		if (stock.getCode().equalsIgnoreCase("PETR4") && stock.getDate().getMonthValue() == 3
				&& stock.getDate().getDayOfMonth() == 21 && stock.getDate().getYear() == 2016) {
			System.out.println("Codigo\tdata\topen Price");
			System.out.println(stock.getCode() + "\t" + stock.getDate() + "\t" + stock.getOpenPrice());
		}
		

	}
}
