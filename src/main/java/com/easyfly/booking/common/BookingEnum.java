package com.easyfly.booking.common;

/**
 * BookingEnum is the enum for the maintaining the values of the Travel type and
 * Payment mode types.
 * 
 * @author Govindasamy
 * @since 03-02-2020
 *
 */
public class BookingEnum {

	/**
	 * Maintaining the travel types such as Economy and Business classes types.
	 * 
	 * @author Govindasamy
	 * @since 03-02-2020
	 */
	public enum TravelType {
		ECONOMY(1), BUSINESS(2);

		private Integer travelType;

		TravelType(Integer travelType) {
			this.travelType = travelType;
		}

		public Integer getTravelType() {
			return travelType;
		}

	}

	/**
	 * Maintaining the payment types such as PayTm and PhonePe types.
	 * 
	 * @author Govindasamy
	 * @since 03-02-2020
	 */
	public enum PaymentType {
		PAYTM(1), PHONEPE(2);

		private Integer paymentType;

		PaymentType(Integer paymentType) {
			this.paymentType = paymentType;
		}

		public Integer getPaymentType() {
			return paymentType;
		}

	}
}
