package cs2114;

public class Lab08Deque<E> extends DoubleLinkDeque<E> {

	
	public Lab08Deque(){
		head = new Node<E>(null);
		tail = new Node<E>(null);
		head.setNext(tail);
		tail.setPrevious(head);
		size = 0;
	}
	
	@Override
	public void enqueueAtFront(E value) {
		Node<E> newNode = new Node<E>(value);
		Node<E> currFirst = head.getNext();
		head.setNext(newNode);
		newNode.setNext(currFirst);
		currFirst.setPrevious(newNode);
		newNode.setPrevious(head);
		size++;
	}

	@Override
	public E dequeueAtFront() {
		if (size == 0) {
			throw new IllegalStateException("the deque is empty");
		}
		E value = head.getNext().getData();
		Node<E> currFirst = head.getNext();
		head.setNext(currFirst.getNext());
		currFirst.getNext().setPrevious(head);
		currFirst.setNext(null);
		currFirst.setPrevious(null);
		size--;
		return value;
	}

	@Override
	public void enqueueAtRear(E value) {
		Node<E> newNode = new Node<E>(value);
		Node<E> currLast = tail.getPrevious();
		tail.setPrevious(newNode);
		newNode.setPrevious(currLast);
		currLast.setNext(newNode);
		newNode.setNext(tail);
		size++;

	}

	@Override
	public E dequeueAtRear() {
		if (size == 0) {
			throw new IllegalStateException("the deque is empty");
		}
		Node<E> currLast = tail.getPrevious();
		E value = currLast.getData();
		tail.setPrevious(currLast.getPrevious());
		currLast.getPrevious().setNext(tail);
		currLast.setNext(null);
		currLast.setPrevious(null);
		size--;
		return value;
	}

	@Override
	public E frontItem() {
		if (size == 0) {
			throw new IllegalStateException("the deque is empty");
		}
		return head.getNext().getData();
	}

	@Override
	public E rearItem() {
		if (size == 0) {
			throw new IllegalStateException("the deque is empty");
		}
		return tail.getPrevious().getData();
	}

	@Override
	public void clear() {
		head.setNext(null);
		tail.setPrevious(null);
		size = 0;

	}
	public String toString() {
		StringBuilder s = new StringBuilder("[");
		while(this.size() > 1) {
			s.append(this.dequeueAtFront().toString());
			s.append(", ");
		}
		if (size == 1) {
			s.append(this.dequeueAtFront().toString());
		}
		s.append("]");
		return s.toString();
	}

}
