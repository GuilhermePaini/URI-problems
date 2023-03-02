def main():
    a = float(input()) * 3.5
    b = float(input()) * 7.5
    
    MEDIA = (a + b)/(3.5 + 7.5)
        
    print("MEDIA = {:0.5f}".format(MEDIA))

if __name__ == "__main__":
    main()