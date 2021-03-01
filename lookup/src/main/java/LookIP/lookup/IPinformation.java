package LookIP.lookup;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import ResouceIP.IPLookUP;

public class IPinformation {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.print("Enter IP Address Here: ");
			try {
				new IPLookUP(br.readLine());
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println();
		}

	}

}
