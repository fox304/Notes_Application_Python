def edit_note(notebook):
    num = int(input("введите номер записи для редактирования: "))

    for i in notebook['title']:
        dic = notebook['title'][i]
        if not num in dic: continue 
        dic[num] = input("введите свою заметку: \n")
        print(f"заметка номер {num} отредактирована ")
    print(notebook)




