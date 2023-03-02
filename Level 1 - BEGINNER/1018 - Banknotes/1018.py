def main():
    
    NOTES = [100, 50, 20, 10, 5, 2, 1]
    
    x = int(input())
    
    print(x)
    
    for note in NOTES:
        y = x // note
        x = x - y * note
        print(str(y) + " nota(s) de R$ " + str(note) + ",00")

if __name__ == "__main__":
    main()
