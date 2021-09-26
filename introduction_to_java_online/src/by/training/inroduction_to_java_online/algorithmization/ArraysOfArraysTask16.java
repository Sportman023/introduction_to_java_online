/*
 * Copyright (C) 2021 Vadim
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package by.training.inroduction_to_java_online.algorithmization;

/**
 * Задание: Магическим квадратом порядка n называется квадратная матрица размера
 * nxn, составленная из чисел 1, 2, 3,..., n^2 так, что суммы по каждому
 * столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
 * Построить такой квадрат.
 * 
 * @author Vadim Ortman
 */
public class ArraysOfArraysTask16 {
	public static void main(String[] args) {
		int size;
		size = 10;

		if (size < 3) {
			System.out.println("Please enter a value > 2");
		} else if ((size - 2) % 4 == 0) {
			even4(size);
		} else if (size % 2 == 0) {
			even(size);
		} else {
			odd(size);
		}
	}

	static void even4(int size) {
		// Magic Squares of Even Order (4n + 2)
		int[][] magicSquare;
		int currentRowIndex;
		int currentColumnIndex;
		int maxValue;
		int nextRowIndex;
		int nextColumnIndex;
		int evenIndex;

		magicSquare = new int[size][size];

		currentRowIndex = 0;
		currentColumnIndex = size / 2 / 2;
		maxValue = (size / 2) * (size / 2);

		magicSquare[currentRowIndex][currentColumnIndex] = 1;

		for (int value = 2; value <= maxValue; value++) {
			nextRowIndex = currentRowIndex - 1;
			nextColumnIndex = currentColumnIndex + 1;

			if (nextRowIndex == -1 && nextColumnIndex == size / 2) {
				currentRowIndex++;

			} else if (nextRowIndex == -1) {
				currentRowIndex = size / 2 - 1;
				currentColumnIndex = nextColumnIndex;

			} else if (nextColumnIndex == size / 2) {
				currentRowIndex = nextRowIndex;
				currentColumnIndex = 0;

			} else if (magicSquare[nextRowIndex][nextColumnIndex] > 0) {
				currentRowIndex++;

			} else {
				currentRowIndex = nextRowIndex;
				currentColumnIndex = nextColumnIndex;
			}
			magicSquare[currentRowIndex][currentColumnIndex] = value;
		}

		for (int rowIndex = size / 2; rowIndex < size; rowIndex++) {
			for (int columnIndex = size / 2; columnIndex < size; columnIndex++) {
				magicSquare[rowIndex][columnIndex] = magicSquare[rowIndex - size / 2][columnIndex - size / 2]
						+ maxValue;
			}
		}

		for (int rowIndex = 0; rowIndex < size / 2; rowIndex++) {
			for (int columnIndex = size / 2; columnIndex < size; columnIndex++) {
				magicSquare[rowIndex][columnIndex] = magicSquare[rowIndex][columnIndex - size / 2] + maxValue * 2;
			}
		}

		for (int rowIndex = size / 2; rowIndex < size; rowIndex++) {
			for (int columnIndex = 0; columnIndex < size / 2; columnIndex++) {
				magicSquare[rowIndex][columnIndex] = magicSquare[rowIndex - size / 2][columnIndex] + maxValue * 3;
			}
		}

//        System.out.println("");
//        for (int rowIndex = 0; rowIndex < size; rowIndex++) {
//            for (int columnIndex = 0; columnIndex < size; columnIndex++) {
//                if (magicSquare[rowIndex][columnIndex] < 10) {
//                    System.out.print("  " + magicSquare[rowIndex][columnIndex] + 
//                            " ");
//                } else if (magicSquare[rowIndex][columnIndex] < 100){
//                    System.out.print(" " + magicSquare[rowIndex][columnIndex] + 
//                            " ");
//                } else{
//                    System.out.print(magicSquare[rowIndex][columnIndex] + " ");
//                }
//            }
//            System.out.println("");
//        }

		evenIndex = (size - 2) / 4;

		for (int column = 0; column <= evenIndex; column++) {
			for (int row = 0; row < size / 2; row++) {
				int tempVal;

				tempVal = magicSquare[row][column];
				magicSquare[row][column] = magicSquare[row + size / 2][column];
				magicSquare[row + size / 2][column] = tempVal;

				if (column == evenIndex - 1 && row == size / 4) {
					tempVal = magicSquare[row][column];
					magicSquare[row][column] = magicSquare[row + size / 2][column];
					magicSquare[row + size / 2][column] = tempVal;
				}

				if (column == evenIndex && row != size / 4) {
					tempVal = magicSquare[row][column];
					magicSquare[row][column] = magicSquare[row + size / 2][column];
					magicSquare[row + size / 2][column] = tempVal;
				}

			}
		}

		for (int column = size - 1; column > size - evenIndex; column--) {
			for (int row = 0; row < size / 2; row++) {
				int tempVal;

				tempVal = magicSquare[row][column];
				magicSquare[row][column] = magicSquare[row + size / 2][column];
				magicSquare[row + size / 2][column] = tempVal;
			}
		}

		System.out.println("");
		for (int rowIndex = 0; rowIndex < size; rowIndex++) {
			for (int columnIndex = 0; columnIndex < size; columnIndex++) {
				if (magicSquare[rowIndex][columnIndex] < 10) {
					System.out.print("  " + magicSquare[rowIndex][columnIndex] + " ");
				} else if (magicSquare[rowIndex][columnIndex] < 100) {
					System.out.print(" " + magicSquare[rowIndex][columnIndex] + " ");
				} else {
					System.out.print(magicSquare[rowIndex][columnIndex] + " ");
				}
			}
			System.out.println("");
		}
	}

	static void odd(int size) {
		int[][] magicSquare;
		int currentRowIndex;
		int currentColumnIndex;
		int maxValue;
		int nextRowIndex;
		int nextColumnIndex;

		magicSquare = new int[size][size];

		currentRowIndex = 0;
		currentColumnIndex = size / 2;
		maxValue = size * size;

		magicSquare[currentRowIndex][currentColumnIndex] = 1;

		for (int value = 2; value <= maxValue; value++) {
			nextRowIndex = currentRowIndex - 1;
			nextColumnIndex = currentColumnIndex + 1;

			if (nextRowIndex == -1 && nextColumnIndex == size) {
				currentRowIndex++;

			} else if (nextRowIndex == -1) {
				currentRowIndex = size - 1;
				currentColumnIndex = nextColumnIndex;

			} else if (nextColumnIndex == size) {
				currentRowIndex = nextRowIndex;
				currentColumnIndex = 0;

			} else if (magicSquare[nextRowIndex][nextColumnIndex] > 0) {
				currentRowIndex++;

			} else {
				currentRowIndex = nextRowIndex;
				currentColumnIndex = nextColumnIndex;

			}
			magicSquare[currentRowIndex][currentColumnIndex] = value;
		}
		// Printing the magic-square
		System.out.println("");
		for (int rowIndex = 0; rowIndex < size; rowIndex++) {
			for (int columnIndex = 0; columnIndex < size; columnIndex++) {
				if (magicSquare[rowIndex][columnIndex] < 10) {
					System.out.print(" " + magicSquare[rowIndex][columnIndex] + " ");
				} else {
					System.out.print(magicSquare[rowIndex][columnIndex] + " ");
				}
			}
			System.out.println("");
		}
	}

	static void even(int size) {
		int[][] magicSquare;
		magicSquare = new int[size][size];

		// filling matrix with its count value
		// starting from 1;
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				magicSquare[row][column] = (size * row) + column + 1;
			}
		}
		// change value of Array elements
		// at fix location as per rule
		// (size * size + 1) - magicSquare[row][column]
		// Top Left corner of Matrix
		// (order (size / 4) * (size / 4))
		for (int row = 0; row < size / 4; row++) {
			for (int column = 0; column < size / 4; column++) {
				magicSquare[row][column] = (size * size + 1) - magicSquare[row][column];
			}
		}
		// Top Right corner of Matrix
		// (order (size / 4) * (size / 4))
		for (int row = 0; row < size / 4; row++) {
			for (int column = 3 * (size / 4); column < size; column++) {
				magicSquare[row][column] = (size * size + 1) - magicSquare[row][column];
			}
		}
		// Bottom Left corner of Matrix
		// (order (size / 4) * (size / 4))
		for (int row = 3 * size / 4; row < size; row++) {
			for (int column = 0; column < size / 4; column++) {
				magicSquare[row][column] = (size * size + 1) - magicSquare[row][column];
			}
		}
		// Bottom Right corner of Matrix
		// (order (size / 4) * (size / 4))
		for (int row = 3 * size / 4; row < size; row++) {
			for (int column = 3 * size / 4; column < size; column++) {
				magicSquare[row][column] = (size * size + 1) - magicSquare[row][column];
			}
		}
		// Centre of Matrix (order (size / 2) * (size / 2))
		for (int row = size / 4; row < 3 * size / 4; row++) {
			for (int column = size / 4; column < 3 * size / 4; column++) {
				magicSquare[row][column] = (size * size + 1) - magicSquare[row][column];
			}
		}
		// Printing the magic-square
		System.out.println("");
		for (int rowIndex = 0; rowIndex < size; rowIndex++) {
			for (int columnIndex = 0; columnIndex < size; columnIndex++) {
				if (magicSquare[rowIndex][columnIndex] < 10) {
					System.out.print(" " + magicSquare[rowIndex][columnIndex] + " ");
				} else {
					System.out.print(magicSquare[rowIndex][columnIndex] + " ");
				}
			}
			System.out.println("");
		}
	}
}
