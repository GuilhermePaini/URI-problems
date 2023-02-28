def main():
    
    array = []
    array.append(int(input()))
    
    for i in range(10):
        array.append((array[i]) * 2)
        print(f"N[{i}] = {array[i]}")
    
if __name__ == "__main__":
    main()