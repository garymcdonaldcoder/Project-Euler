#include "stdafx.h"
#include "SimilarityCalculator.h"
#include <Vector>

SimilarityCalculator::SimilarityCalculator()		// set values to 0
{
	intCountValue = 0;
	doubleCountValue = 0;
	floatCountValue = 0;
	charCountValue = 0;
	voidCountValue = 0;
	boolCountValue = 0;
	forCountValue = 0;
	ifCountValue = 0;
	elseCountValue = 0;
	whileCountValue = 0;
	doCountValue = 0;

	intInstances = 0;
	doubleInstances = 0;
	floatInstances = 0;
	charInstances = 0;
	voidInstances = 0;
	boolInstances = 0;
	forInstances = 0;
	ifInstances = 0;
	elseInstances = 0;
	whileInstances = 0;
	doInstances = 0;
}


SimilarityCalculator::~SimilarityCalculator()
{
}

int SimilarityCalculator::CalculateSimilarityMetric(string &fileChoice, string &filePath)  {  //opens file and calculates total numeric value of file



	ifstream inFile;
	string item;
	int total = 0;

	inFile.open(filePath + fileChoice);


	if (inFile.fail())
	{
		return -1;
	}

	while (!inFile.eof())
	{
		inFile >> item;
		if (item == "int")
		{
			intCountValue += 1;            // +1 total int numeric value for instance of type int found
			intInstances++;					// +1 amount of instances of int appear
		}
		if (item == "double")
		{
			doubleCountValue += 2;		 // +2 total double numeric value for instance of type int found
			doubleInstances++;			// +1 amount of instances of double appear
		}
		if (item == "float")
		{
			floatCountValue += 3;
			floatInstances++;
		}
		if (item == "char")
		{
			charCountValue += 4;
			charInstances++;
		}
		if (item == "void")
		{
			voidCountValue += 5;
			voidInstances++;
		}
		if (item == "bool")
		{
			boolCountValue += 6;
			boolInstances++;
		}
		if (item == "if")
		{
			ifCountValue += 7;
			ifInstances++;
		}
		if (item == "else")
		{
			elseCountValue += 8;
			elseInstances++;
		}
		if (item == "for")
		{
			forCountValue += 9;
			forInstances++;
		}
		if (item == "while")
		{
			whileCountValue += 10;
			whileInstances++;
		}
		if (item == "do")
		{
			doCountValue += 11;
			doInstances++;
		}

	}

	total = intCountValue + doubleCountValue + floatCountValue + charCountValue + voidCountValue + boolCountValue +
		forCountValue + ifCountValue + elseCountValue + whileCountValue + doCountValue;    // total numeric value of file

	inFile.close();
	return total;
}

Count SimilarityCalculator::getInstances()				// return all instances of each
{
	Count toReturn;


	toReturn.intInstances = intInstances;
	toReturn.doubleInstances = doubleInstances;
	toReturn.floatInstances = floatInstances;
	toReturn.charInstances = floatInstances;
	toReturn.voidInstances = voidInstances;
	toReturn.boolInstances = boolInstances;
	toReturn.forInstances = forInstances;
	toReturn.ifInstances = ifInstances;
	toReturn.elseInstances = elseInstances;
	toReturn.whileInstances = whileInstances;
	toReturn.doInstances = doInstances;

	return toReturn;
}

string SimilarityCalculator::printInstances(Count& toPrint)
{
	ostringstream oss;
	oss << "Int Instances:\t\t" << toPrint.ifInstances
		<< "\nDouble Instances:\t" << toPrint.doubleInstances
		<< "\nFloat Instances:\t" << toPrint.floatInstances
		<< "\nChar Instances:\t\t" << toPrint.charInstances
		<< "\nVoid Instances:\t\t" << toPrint.voidInstances
		<< "\nBool Instances:\t\t" << toPrint.boolInstances
		<< "\nFor Instances:\t\t" << toPrint.forInstances
		<< "\nIf Instances:\t\t" << toPrint.ifInstances
		<< "\nElse Instances:\t\t" << toPrint.elseInstances
		<< "\nWhile Instances:\t" << toPrint.whileInstances
		<< "\nDo Instances:\t\t" << toPrint.doInstances << endl;

	return oss.str();
}

double SimilarityCalculator::CalculatePercentageDifference(int choice1, int choice2)	
{

	double difference = choice1 - choice2;
	double result = (difference / choice1) * 100;

	if (result > 0)
	{
		return 100 - result;   // minus 100 give percentage similarity rather  difference
	}
	else if (result < 0)
	{
		result *= -1;
		return 100 - result;  //converts a minus number to a positive to always have positive percentage result
	}
	else if (result == 0)
	{
		return  100;		// if no difference in numeric value is found return 100 for 100 percent similarity
	}
}

void SimilarityCalculator::ResetValues()   // reset values to 0 so second file cann be processed
{
	intCountValue = 0;
	doubleCountValue = 0;
	floatCountValue = 0;
	charCountValue = 0;
	voidCountValue = 0;
	boolCountValue = 0;
	forCountValue = 0;
	ifCountValue = 0;
	elseCountValue = 0;
	whileCountValue = 0;
	doCountValue = 0;

	intInstances = 0;
	doubleInstances = 0;
	floatInstances = 0;
	charInstances = 0;
	voidInstances = 0;
	boolInstances = 0;
	forInstances = 0;
	ifInstances = 0;
	elseInstances = 0;
	whileInstances = 0;
	doInstances = 0;

}


//*Usage: Used code to open file choice based on choice. (filepath + fileChoice)
//*    Title : Checksums, Data Integrity
//*    Author : AustinWolfman
//*    Date : 2015
//* Code version : -
//*    Availability :  http ://stackoverflow.com/questions/33794412/checksums-data-integrity


	//*Usage : Used to control the correct opening of a file
	//*    Title : stuck on loop for (infile.fail())
	//*    Author : mux77
	//*    Date : 2011
	//* Code version : -
	//*	 Availability : http://www.cplusplus.com/forum/general/39635/