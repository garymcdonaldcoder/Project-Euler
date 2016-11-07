// ConsoleApplication2.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include "SimilarityCalculator.h"
#include <iomanip>
#include <cmath>
#include <iostream>
#include <string>
#include <fstream>
#include <Vector>


using namespace std;


int main()
{

	vector<int> results;
	vector<string> fileChoices;
	vector<Count> instances;
	Count instanceStorage;
	int counter = 0;
	char again = 'Y';
	SimilarityCalculator calc;
	int choice1, choice2;
	double percentageDiffPartA;
	string filePath = "h:\myfiles";
	

	do
	{
		string fileChoice;
		cout << "\nEnter File Name to Check." << endl;
		cin >> fileChoice;

		int similarityMetric = calc.CalculateSimilarityMetric(fileChoice,filePath);  // count instances of variables & conditional statements. Also provides numeric value of file

		if (similarityMetric == -1)
		{
			cout << "Error Reading File, Please Try Again." << endl;		// error check to make sure file is valid
		}
		else {
			cout << "\nSimilairity Metric for this File is: " << similarityMetric << endl;

			instanceStorage = calc.getInstances();    // function to get instances of each variable *conditional statement
			results.push_back(similarityMetric);      // push back to increase size
			fileChoices.push_back(fileChoice);        // push back to increase size
			instances.push_back(instanceStorage);		// push back to increase size
			counter++;
			calc.ResetValues();						// reset all variable values to zero to process next file
		}

		cout << "\nWould you like to check another file?(Y/N)" << endl;
		cin >> again;

	} while (again == 'Y' || again == 'y');			// Loop condition to ask if user wants to enter another file



	cout << "\n======Results======" << endl;

	for (int i = 0; i < results.size(); i++) {
		cout << "\n\nFile:" << (i + 1) << " " << fileChoices[i] << " Had a Similarity Index of:" << results[i] << endl; //print file number, choice and numeric value
		Count c = instances.at(i);				// store instances in 'c' for printing
		cout << endl << calc.printInstances(c);  // print instances of each variable &  condition statement
	}

	if (results.size() >= 2) {												// must have 2 or files input to compare
		cout << " \nWould you like to compare two files? (Y/N)" << endl;	
		cin >> again;										
	}
	else
		again = 'N';

	if (again == 'Y' || again == 'y') {
		
		do {
			cout << "Choose a base file to compare against (Number Between 1 and " << results.size() << ")" << endl;
			cin >> choice1;

			cout << "Choose another file to compare against the base (Number Between 1 and " << results.size() << ")" << endl;
			cin >> choice2;
			

			if (choice1 <= 0 || choice2 <= 0 || choice1 > results.size() || choice2 > results.size()) {					// error checker to make sure user enters correct file number
				cout << "Invalid selection, must be between 1 and " << results.size() << "\nPlease Try again.." << endl;
			}
			else
				cout << "\nThese Files are " << calc.CalculatePercentageDifference(results.at(choice1 - 1), results.at(choice2 - 1)) << "% Similar" << endl;   //function that caculates the difference 


			cout << "\nWould you like to compare another two files? (Y/N)" << endl;
			cin >> again;

		} while (again == 'Y' || again == 'y');
	}



	system("pause");
	return 0;
}

//*Usage: Control of while loops
//*    Title : Use bool value to control a while loop : bool « Data Types « C++ Tutorial
//*    Author : java2s.com 
//*    Date : 2015
//* Code version : -
//*    Availability : http://www.java2s.com/Tutorial/Cpp/0040__Data-Types/Useboolvaluetocontrolawhileloop.htm