package com.avinya.algorithm.utils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class HasCodeEqualExample {

	private String symbol;
	private String exchange;
	private long lotSize;
	private int tickSize;
	private boolean isRestricted;
	private Date settlementDate;
	private BigDecimal price;


	
	   @Override
		public int hashCode() {

			final int prime = 89;
			int hash = 5;

			hash = prime * hash + (this.exchange != null ? this.exchange.hashCode() : 0);
			hash = prime * hash + (this.isRestricted ? Boolean.hashCode(this.isRestricted) : 0);
			hash = prime * hash + (int) (this.lotSize == 0 ? Long.hashCode(lotSize) : 0);
			return hash;
		}	

	/*-
       @Override
       public int hashCode() {
              final int prime = 31;
              int result = 1;
              result = prime * result
                           + ((exchange == null) ? 0 : exchange.hashCode());
              result = prime * result + (isRestricted ? 1231 : 1237);
              result = prime * result + (int) (lotSize ^ (lotSize >>> 32));
              result = prime * result + ((price == null) ? 0 : price.hashCode());
              result = prime * result
                           + ((settlementDate == null) ? 0 : settlementDate.hashCode());
              result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
              result = prime * result + tickSize;
              return result;
       }	 
	 
	@Override
	public int hashCode() {
		return Objects.hash(exchange, isRestricted, lotSize, price, settlementDate, symbol, tickSize);
	} 
	 https://javarevisited.blogspot.com/2011/10/override-hashcode-in-java-example.html?m=1
	 https://javarevisited.blogspot.com/2011/02/how-to-write-equals-method-in-java.html#axzz7Wi4VnBFv
	 https://javarevisited.blogspot.com/2013/08/10-equals-and-hashcode-interview.html#axzz7Wi4VnBFv
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HasCodeEqualExample other = (HasCodeEqualExample) obj;
		return Objects.equals(exchange, other.exchange) && isRestricted == other.isRestricted
				&& lotSize == other.lotSize && Objects.equals(price, other.price)
				&& Objects.equals(settlementDate, other.settlementDate) && Objects.equals(symbol, other.symbol)
				&& tickSize == other.tickSize;
	}

}
