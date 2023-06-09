def del_note(notebook):
    num = int(input("введите номер записи для удаления: "))

    for i in notebook['title']:
        dic = notebook['title'][i]
        if not num in dic: continue 

        print(f"запись номер {num} удалена ")
        dic.pop(num)
    print(notebook)

