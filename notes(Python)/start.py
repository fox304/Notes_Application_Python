import menu

if __name__ == "__main__":
    n_book = menu.start_notebook() # создание изначальных записей и запись их в файл
    menu.my_menu(n_book)           # распечатка изначальных записей
