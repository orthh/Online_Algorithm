def solution(sides):
    sides.sort();
    print(sides);
    print(sides[0]);
    print(sides[1]);
    print(sides[2]);
    
    if sides[0] + sides[1] > sides[2] :
        return 1;
    else: return 2;