/*C)B) Write a program to create linked list with given number in which data part of each node 
 contains individual digit of the number.
(Ex. Suppose the number is 368 then the nodes of linked list should contain 3, 6, 8)
*/
package day4assignment;

public class LinkedlistAssignment1 {

	Knode root;

	void create_list() {

		root = null;// preparing with empty root

	}

	void insert_left(int data) {

		Knode n = new Knode(data);

		if (root == null) {

			root = n;

		} else {

			n.next = root;// 1

			root = n;// 2

		}

		System.out.println(root.data + " inserted");

	}

	void delete_left() {

		if (root == null) {

			System.out.println("Empty List");

		} else {

			Knode t;

			t = root;// 1

			root = root.next;// 2

			System.out.println(t.data + " deleted");

		}

	}

	void print_list() {

		if (root == null)

			System.out.println("List Empty");

		else {

			Knode t = root;

			while (t != null) {

				System.out.print("|" + t.data + "|->");

				t = t.next;

			}

		}

	}

}
