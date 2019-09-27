package jb29.unit9.classes;

import java.util.Scanner;
import java.util.Calendar;

// 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

public class Task04 {

	public static void main(String[] args) {

		int trainNumber;

		Train[] trainList = { new Train(), new Train(), new Train(), new Train(), new Train() };

		trainNumber = enterIntFromConsole("train number");

		populateTrain(trainList);
		printTrain(trainList);

		findTrainByNumber(trainList, trainNumber);

		sortTrainByNumber(trainList);
		printTrain(trainList);

		sortTrainByNamePoint(trainList);
		printTrain(trainList);

	}

	public static void findTrainByNumber(Train[] trainList, int trainNumber) {

		boolean isTrainExists;

		isTrainExists = false;

		System.out.println("-----------------------");
		System.out.println("CHECK FOR TRAIN NUMBER");
		System.out.println("-----------------------");

		for (Train train : trainList) {

			if (train.getTrainNumber() == trainNumber) {

				System.out.println(train.toString());

				isTrainExists = true;

			}

		}

		if (isTrainExists == false) {

			System.out.println("There is no such train");
		}

	}

	public static void sortTrainByNumber(Train[] trainList) {

		Train maxTrain;
		int maxTrainIndex;

		System.out.println("-----------------------");
		System.out.println("SORT TRAIN BY ITS NUMBER");
		System.out.println("-----------------------");

		for (int i = 0; i < trainList.length - 1; i++) {

			maxTrain = trainList[i];
			maxTrainIndex = i;

			for (int j = i + 1; j < trainList.length; j++) {

				if (maxTrain.getTrainNumber() < trainList[j].getTrainNumber()) {
					maxTrain = trainList[j];
					maxTrainIndex = j;
				}
			}

			Train tempTrain = trainList[i];
			trainList[i] = maxTrain;
			trainList[maxTrainIndex] = tempTrain;

		}

	}

	public static void sortTrainByNamePoint(Train[] trainList) {

		Train maxTrain;
		int maxTrainIndex;

		System.out.println("-----------------------");
		System.out.println("SORT TRAIN BY ITS NAME POINT");
		System.out.println("-----------------------");

		for (int i = 0; i < trainList.length - 1; i++) {

			maxTrain = trainList[i];
			maxTrainIndex = i;

			for (int j = i + 1; j < trainList.length; j++) {

				if (maxTrain.getNamePoint().compareTo(trainList[j].getNamePoint()) < 0) {
					maxTrain = trainList[j];
					maxTrainIndex = j;
				}

				else if (maxTrain.getNamePoint().compareTo(trainList[j].getNamePoint()) == 0) {
					if (maxTrain.getDepartureDate().compareTo(trainList[j].getDepartureDate()) > 0) {
						maxTrain = trainList[j];
						maxTrainIndex = j;
					}
				}
			}

			Train tempTrain = trainList[i];
			trainList[i] = maxTrain;
			trainList[maxTrainIndex] = tempTrain;

		}

	}

	public static void populateTrain(Train[] trainList) {

		Train train;

		for (int i = 0; i < trainList.length; i++) {

			Calendar cal = Calendar.getInstance();

			cal.add(Calendar.HOUR, -i);

			train = new Train("point" + i, i * i * 100 + 24, cal.getTime());

			trainList[i] = train;

		}
	}

	public static void printTrain(Train[] trainList) {

		for (Train train : trainList) {

			System.out.println(train.toString());
		}

	}

	public static int enterIntFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.println("Enter " + message + ": ");

		while (!scanner.hasNextInt()) {
			scanner.next();

			System.out.println("Enter " + message + ": ");
		}
		number = scanner.nextInt();

		return number;

	}
}
