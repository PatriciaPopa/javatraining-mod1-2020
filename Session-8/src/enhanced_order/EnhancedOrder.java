package enhanced_order;

public class EnhancedOrder {
	private EnhancedStatus status;

	public EnhancedOrder() {
		this.status = EnhancedStatus.ORDERED;
	}

	public EnhancedStatus getStatus() {
		return status;
	}

	public void setStatus(EnhancedStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [status=" + status + "]";
	}

	public boolean isDeliverable() {
		if(this.status == EnhancedStatus.READY) {
			return true;
		}

		return false;
	}

	public boolean isOrdered() {
		if(this.status == EnhancedStatus.ORDERED) {
			return true;
		}

		return false;
	}

	public boolean isReady() {
		if(this.status == EnhancedStatus.READY) {
			return true;
		}

		return false;
	}

	public boolean isDelivered() {
		if(this.status == EnhancedStatus.DELIVERED) {
			return true;
		}

		return false;
	}

	public void printTimeToDeliver() {
		System.out.println(this.status.getTimeLeftTillDelivery());
	}
}

enum EnhancedStatus{
	ORDERED(120), READY(20), DELIVERED(0);

	private int timeLeftTillDelivery;

	EnhancedStatus(int timeLeftTillDelivery){
		this.timeLeftTillDelivery = timeLeftTillDelivery;
	}

	public int getTimeLeftTillDelivery() {
		return timeLeftTillDelivery;
	}

	public void setTimeLeftTillDelivery(int timeLeftTillDelivery) {
		this.timeLeftTillDelivery = timeLeftTillDelivery;
	}
}
