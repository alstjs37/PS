while True:
    str = input()

    if str == '0': break
    print('yes' if str==str[::-1] else 'no')