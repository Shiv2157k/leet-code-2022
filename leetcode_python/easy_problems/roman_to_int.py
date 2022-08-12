

class RomanToInt:

    def convert(self, s: str):

        roman = {
            "I": 1,
            # "IV": 4,
            "V": 5,
            # "IX": 9,
            "X": 10,
            # "XL": 40,
            "L": 50,
            # "XC":90,
            "C": 100,
            # "CD": 400,
            "D": 500,
            # "CM": 900,
            "M": 1000
        }

        total = 0
        counter = 0
        # 4 3 2 1 0
        # X L V I I

        while counter < len(s):
            if len(s) - counter >= 2 and roman.get(s[counter]) < roman.get(s[counter + 1]):
                total = total + (roman.get(s[counter + 1]) - roman.get(s[counter]))
                counter += 2
            else:
                total = total + roman.get(s[counter])
                counter += 1
        return total


if __name__ == "__main__":
    romanToInt = RomanToInt()
    print(romanToInt.convert("XLVII"))

        