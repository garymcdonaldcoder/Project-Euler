#include "stdafx.h"
#include <iomanip>
#include <cmath>
#include <iostream>
#include <string>
#include <fstream>
#include <sstream>


using namespace std;


struct Count {

	int intInstances;
	int doubleInstances;
	int floatInstances;
	int charInstances;
	int voidInstances;
	int boolInstances;
	int forInstances;
	int ifInstances;
	int elseInstances;
	int whileInstances;
	int doInstances;

};


#pragma once
class SimilarityCalculator
{
public:
	SimilarityCalculator();
	~SimilarityCalculator();

	int CalculateSimilarityMetric(string &fileChoice, string &filePath);
	double CalculatePercentageDifference(int choice1, int choice2);
	Count getInstances();
	string printInstances(Count& toPrint);
	void ResetValues();

private:
	
	int intCountValue;
	int doubleCountValue;
	int floatCountValue;
	int charCountValue;
	int voidCountValue;
	int boolCountValue;
	int forCountValue;
	int ifCountValue;
	int elseCountValue;
	int whileCountValue;
	int doCountValue;

	
	int intInstances;
	int doubleInstances;
	int floatInstances;
	int charInstances;
	int voidInstances;
	int boolInstances;
	int forInstances;
	int ifInstances;
	int elseInstances;
	int whileInstances;
	int doInstances;
	
};

