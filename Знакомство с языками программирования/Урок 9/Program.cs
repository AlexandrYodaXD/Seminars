// Задайте значения M и N. Напишите программу, которая выведет все натуральные числа в промежутке от M до N.
string NumsTier(int m, int n)
{
    if (m < n) return NumsTier(m, n-1) + $" {n}";
    return $"{n}";
}

//System.Console.WriteLine(NumsTier(2, 8));

double PowAInB(double a, double b)
{
    if (b == 0) return 1;
    return a * PowAInB(a, b - 1);
}

System.Console.WriteLine(PowAInB(2, 4));

int n = 1;

void Alph(string alphabet, char[] word, int length = 0)
{
    if (length == word.Length)
    {
        System.Console.WriteLine($"{n++} {new String(word)}"); return;
    }
    for (int i = 0; i < alphabet.Length; i++)
    {
        word[length] = alphabet[i];
        Alph(alphabet, word, length + 1);
    }
}

Alph("аисв", new char[3]);