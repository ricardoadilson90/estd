package bovespaTest;

import java.io.IOException;

import org.junit.Test;
import bovespa.StockManager;

public class StockTest {
	
	@Test
	public void loadStocksTest() throws IOException{
		StockManager stockManager = new StockManager();
		stockManager.loadStocks("Z:/3 ano/COTAHIST_A2016test.txt");
	}
}
