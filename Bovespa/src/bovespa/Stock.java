package bovespa;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Stock {
	private String code;
	private LocalDate date;
	private BigDecimal openPrice;
	private BigDecimal closePrice;
	private BigDecimal MinPrice;
	private BigDecimal MaxPrice;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public BigDecimal getOpenPrice() {
		return openPrice;
	}
	public void setOpenPrice(BigDecimal openPrice) {
		this.openPrice = openPrice;
	}
	public BigDecimal getClosePrice() {
		return closePrice;
	}
	public void setClosePrice(BigDecimal closePrice) {
		this.closePrice = closePrice;
	}
	public BigDecimal getMinPrice() {
		return MinPrice;
	}
	public void setMinPrice(BigDecimal minPrice) {
		MinPrice = minPrice;
	}
	public BigDecimal getMaxPrice() {
		return MaxPrice;
	}
	public void setMaxPrice(BigDecimal maxPrice) {
		MaxPrice = maxPrice;
	}
	
	

}
