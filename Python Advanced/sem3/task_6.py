def func(dct_comp: dict) -> bool:
    for i in dct_comp.values():
        if sum(i) < 0:
            return False
    return True
