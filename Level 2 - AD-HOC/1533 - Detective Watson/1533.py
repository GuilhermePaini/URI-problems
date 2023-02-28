def main():
    while True:
        
        N = int(input())
        
        if(N == 0): 
            break
        
        pep = list(map(int, input().split(" ")))
        
        majorsus = max(pep)
        secondmajorsus = max(p for p in pep if p != majorsus)
        
        print(pep.index(secondmajorsus) + 1)

if __name__ == '__main__':
    main()