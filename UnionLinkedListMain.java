package day4assignment;
import java.util.*;
public class UnionLinkedListMain {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			UnionLinkeList list1 = new UnionLinkeList();
			System.out.println("Enter elements for the first sorted linked list (enter -1 to stop)");
			while (true) {
				int input = scanner.nextInt();
				if (input == -1) {
					break;
				}
				list1.insertSorted(input);
			}
			UnionLinkeList list2 = new UnionLinkeList();
			System.out.println("Enter elements for the second sorted linked list (enter -1 to stop)");
			while (true) {
				int input = scanner.nextInt();
				if (input == -1) {
					break;
				}
				list2.insertSorted(input);
			}
			System.out.print("First linked list: ");
			list1.display();
			System.out.print("Second linked list: ");
			list2.display();
			UnionLinkeList UnionLinkeList=list1.union(list2);
			System.out.print("Union of the linked lists: ");
			UnionLinkeList.display();
			scanner.close();
		}
	}



	


