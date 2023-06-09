
def print_all(notebook):
    for i in notebook['title']:
        
        dic = notebook['title'][i] # список записей в конкретном заголовке
        n = len(dic)
        print('-------------------')
        print(f"В заголовке \"{i}\" {n} записей:")
        print('-------------------')
        for j in dic:
            print(f"дата: {dic[j][0]}, запись номер {j}: ")
            print(dic[j][1])
        