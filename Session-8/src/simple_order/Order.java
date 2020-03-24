package simple_order;

public class Order {
	private Status status;

	public Order() {
		this.status = Status.ORDERED;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [status=" + status + "]";
	}

	public boolean isDeliverable() {
		if(this.status == Status.READY) {
			return true;
		}

		return false;
	}

	public boolean isOrdered() {
		if(this.status == Status.ORDERED) {
			return true;
		}

		return false;
	}

	public boolean isReady() {
		if(this.status == Status.READY) {
			return true;
		}

		return false;
	}

	public boolean isDelivered() {
		if(this.status == Status.DELIVERED) {
			return true;
		}

		return false;
	}

	enum Status{
		ORDERED, READY, DELIVERED;
	}
}

