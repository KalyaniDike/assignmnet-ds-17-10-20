package day4assignment;
import java.util.Scanner;
public class UnionLinkeList {
	
             private Unode head;

		public void insertSorted(int data) {
			Unode newNode = new Unode(data);
			if (head == null || head.data > data) {
				newNode.next = head;
				head = newNode;
			} else {
				Unode current = head;
				while (current.next != null && current.next.data <= data) {
					current = current.next;
				}
				if (current.data != data) {
					newNode.next = current.next;
					current.next = newNode;
				}
			}
		}

		public void display() {
			Unode current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}

		public UnionLinkeList union(UnionLinkeList list2) {
			UnionLinkeList unionList = new UnionLinkeList();
			Unode current1 = this.head;
			Unode current2 = list2.head;

			while (current1 != null && current2 != null) {
				if (current1.data < current2.data) {
					unionList.insertSorted(current1.data);
					current1 = current1.next;
				} else if (current1.data > current2.data) {
					unionList.insertSorted(current2.data);
					current2 = current2.next;
				} else {
					unionList.insertSorted(current1.data);
					current1 = current1.next;
					current2 = current2.next;
				}
			}
			while (current1 != null) {
				unionList.insertSorted(current1.data);
				current1 = current1.next;
			}
			while (current2 != null) {
				unionList.insertSorted(current2.data);
				current2 = current2.next;
			}
			return unionList;
		}
	}

	