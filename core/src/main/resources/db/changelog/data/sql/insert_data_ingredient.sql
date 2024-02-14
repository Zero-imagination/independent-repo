insert into ingredient(name, price, description, quantity, expiration_date, dish_id, manufacturer_id)
values
    /*борщ*/
    ('Морковь', 50, 'Морковь свежая', 50, '2024-02-16', 1, 2),
    ('Лук репчатый', 30, 'Лук репчатый', 50, '2024-02-16', 1, 2),
    ('Капуста', 40, 'Капуста белокочанная', 100, '2024-02-16', 1, 2),
    ('Картофель', 70, 'Картофель', 100, '2024-02-20', 1, 2),
    ('Говядина', 550, 'Говяжья вырезка', 300, '2024-02-21', 1, 1),
    ('Специи', 50, 'Смесь специй для борща', 10, '2022-03-02', 1, 4),

    /*пельмени*/
    ('Мука', 50, 'Мука пшеничная высший сорт', 100, '2024-02-25', 2, 1),
    ('Говядина', 550, 'Говядина мелкими кусочками', 150, '2024-02-21', 2, 1),
    ('Свинина', 400, 'Свинина мелкими кусочками', 150, '2024-02-23', 2, 1),
    ('Лук репчатый', 30, 'Лук репчатый нарезанный', 30, '2024-02-20', 2, 2),
    ('Вода', 0, 'Вода чистая', 500, '2024-02-15', 2, 1),
    ('Соль', 10, 'Соль поваренная', 5, '2024-02-10', 2, 4),
    ('Перец черный молотый', 50, 'Перец черный молотый', 5, '2024-02-10', 2, 4),

    ('Свинина', 300, 'Свиной шашлык', 150, '2024-03-05', 3, 1),
    ('Лук', 30, 'Лук репчатый', 10, '2024-03-01', 3, 2),
    ('Перец', 50, 'Сладкий перец', 20, '2024-03-02', 3, 2),

    ('Томат', 70, 'Помидоры свежие', 30, '2024-03-03', 4, 2),
    ('Макароны', 60, 'Спагетти', 100, '2024-03-10', 4, 1),
    ('Бекон', 400, 'Бекон копченый', 50, '2024-03-07', 4, 1),
    ('Сливки', 80, 'Сливки 20%', 50, '2024-03-15', 4, 1),
    ('Яйцо', 50, 'Куриное яйцо', 2, '2024-02-28', 4, 1),

    ('Водоросли нори', 150, 'Водоросли нори для суши', 5, '2024-03-25', 5, 1),
    ('Рис для суши', 40, 'Рис для суши', 100, '2024-03-30', 5, 1),
    ('Лосось', 800, 'Филе лосося свежее', 50, '2024-04-05', 5, 1),

    ('Рис', 30, 'Рис длиннозерный', 50, '2024-03-20', 7, 1),
    ('Авокадо', 100, 'Авокадо спелое', 30, '2024-04-10', 7, 2),
    ('Огурец', 40, 'Огурец свежий', 20, '2024-04-15', 7, 2),
    ('Икра летучей рыбы', 5000, 'Икра летучей рыбы красная', 10, '2024-04-20', 7, 1),

    ('Сыр моцарелла', 250, 'Сыр моцарелла тертый', 50, '2024-04-25', 8, 3),
    ('Тесто для пиццы', 60, 'Тесто для пиццы дрожжевое', 200, '2024-05-01', 8, 1),
    ('Томатный соус', 50, 'Томатный соус для пиццы', 100, '2024-05-05', 8, 1),

    ('Говяжья котлета', 400, 'Котлета говяжья жареная', 100, '2024-05-10', 9, 1),
    ('Булочка для бургера', 20, 'Булочка для бургера с кунжутом', 1, '2024-05-15', 9, 1),
    ('Картофель фри', 80, 'Картофель фри замороженный', 100, '2024-05-20', 9, 1),
    ('Кетчуп', 30, 'Кетчуп томатный', 10, '2024-05-25', 9, 1),

    ('Карри порошок', 70, 'Карри порошок для приготовления блюд', 5, '2024-05-30', 10, 4),
    ('Курица филе', 200, 'Куриное филе отварное', 150, '2024-06-05', 10, 1),

    /*Том Ям*/
    ('Креветки', 800, 'Креветки крупные', 100, '2024-02-25', 11, 1),
    ('Лимонграсс', 100, 'Лимонграсс свежий', 10, '2024-02-18', 11, 2),
    ('Грибы шиитаке', 300, 'Грибы шиитаке свежие', 50, '2024-02-23', 11, 2),
    ('Листья лайма', 50, 'Листья лайма свежие', 5, '2024-02-20', 11, 2),
    ('Чили', 40, 'Перец чили свежий', 5, '2024-02-15', 11, 4),
    ('Кокосовое молоко', 150, 'Кокосовое молоко', 200, '2024-02-10', 11, 1),
    ('Корень имбиря', 80, 'Имбирь свежий', 10, '2024-02-10', 11, 4),
    ('Кафир лайм', 70, 'Листья кафир лайма', 5, '2024-02-10', 11, 2),

    /*цезарь*/
    ('Куриное филе', 300, 'Куриное филе обжаренное', 150, '2024-02-10', 12, 1),
    ('Салат Римский', 80, 'Листья салата Римского', 50, '2024-02-12', 12, 2),
    ('Сыр Пармезан', 600, 'Сыр Пармезан тертый', 30, '2024-02-15', 12, 3),
    ('Хлеб', 50, 'Хлеб белый', 50, '2024-02-18', 12, 1),
    ('Чеснок', 120, 'Чеснок мелко нарезанный', 10, '2024-02-10', 12, 2),
    ('Оливковое масло', 200, 'Оливковое масло Extra Virgin', 20, '2024-02-20', 12, 1),
    ('Лимон', 80, 'Лимон свежий', 30, '2024-02-15', 12, 2),
    ('Перец черный молотый', 50, 'Перец черный молотый', 5, '2024-02-10', 12, 4),

    ('Баклажаны', 60, 'Баклажаны свежие', 50, '2024-06-10', 13, 2),
    ('Кабачки', 40, 'Кабачки свежие', 30, '2024-06-15', 13, 2),
    ('Помидоры', 80, 'Помидоры свежие для рагу', 40, '2024-06-20', 13, 2),
    ('Лук репчатый', 30, 'Лук репчатый нарезанный для рагу', 20, '2024-06-25', 13, 2),
    ('Морковь', 40, 'Морковь свежая нарезанная для рагу', 30, '2024-06-30', 13, 2),

    ('Баклажаны', 60, 'Баклажаны обжаренные для лагмана', 50, '2024-07-05', 14, 2),
    ('Перец сладкий', 50, 'Сладкий перец нарезанный для лагмана', 30, '2024-07-10', 14, 2),
    ('Морковь', 40, 'Морковь нарезанная для лагмана', 30,'2024-07-15' ,14 ,2),
    ('Лук репчатый' ,30 ,'Лук репчатый нарезанный для лагмана' ,20 ,'2024-07-20' ,14 ,2),
    ('Мясо баранины' ,500 ,'Мясо баранины нарезанное' ,150 ,'2024-07-25' ,14 ,1 ),

    /*котлета по киевски*/
    ('Курица', 200, 'Куриное филе', 150, '2024-02-28', 18, 1),
    ('Сливочное масло', 120, 'Сливочное масло', 20, '2024-02-25', 18, 1),
    ('Чеснок', 80, 'Чеснок свежий', 5, '2024-02-23', 18, 2),
    ('Петрушка', 30, 'Петрушка свежая', 5, '2024-02-20', 18, 2),
    ('Яйцо', 50, 'Куриное яйцо', 1, '2024-02-15', 18, 1),
    ('Мука', 40, 'Пшеничная мука', 50, '2024-02-10', 18, 1),
    ('Соль', 10, 'Поваренная соль', 5, '2024-02-10', 18, 4),

    ('Помидоры' ,80 ,'Помидоры свежие' ,50 ,'2024-08-01' ,19 ,2),
    ('Огурцы' ,40 ,'Огурцы свежие' ,30 ,'2024-08-05' ,19 ,2 ),
    ('Перец сладкий' ,50 ,'Сладкий перец нарезанный' ,20 ,'2024-08-10' ,19 ,2 ),
    ('Лук красный' ,40 ,'Лук красный мелко нарезанный' ,20 ,'2024-08-15' ,19 ,2 ),
    ('Чеснок', 60 ,'Чеснок мелко нарезанный' ,10 ,'2024-08-20', 19, 2),

    /*дубликат*/

    /*борщ*/
    ('Морковь', 50, 'Морковь свежая', 50, '2024-02-16', 20, 2),
    ('Лук репчатый', 30, 'Лук репчатый', 50, '2024-02-16', 20, 2),
    ('Капуста', 40, 'Капуста белокочанная', 100, '2024-02-16', 20, 2),
    ('Картофель', 70, 'Картофель', 100, '2024-02-20', 20, 2),
    ('Говядина', 550, 'Говяжья вырезка', 300, '2024-02-21', 20, 1),
    ('Специи', 50, 'Смесь специй для борща', 10, '2022-03-02', 20, 4),

    /*пельмени*/
    ('Мука', 50, 'Мука пшеничная высший сорт', 100, '2024-02-25', 21, 1),
    ('Говядина', 550, 'Говядина мелкими кусочками', 150, '2024-02-21', 21, 1),
    ('Свинина', 400, 'Свинина мелкими кусочками', 150, '2024-02-23', 21, 1),
    ('Лук репчатый', 30, 'Лук репчатый нарезанный', 30, '2024-02-20', 21, 2),
    ('Вода', 0, 'Вода чистая', 500, '2024-02-15', 21, 1),
    ('Соль', 10, 'Соль поваренная', 5, '2024-02-10', 21, 4),
    ('Перец черный молотый', 50, 'Перец черный молотый', 5, '2024-02-10', 21, 4),

    ('Свинина', 300, 'Свиной шашлык', 150, '2024-03-05', 22, 1),
    ('Лук', 30, 'Лук репчатый', 10, '2024-03-01', 22, 2),
    ('Перец', 50, 'Сладкий перец', 20, '2024-03-02', 22, 2),

    ('Томат', 70, 'Помидоры свежие', 30, '2024-03-03', 23, 2),
    ('Макароны', 60, 'Спагетти', 100, '2024-03-10', 23, 1),
    ('Бекон', 400, 'Бекон копченый', 50, '2024-03-07', 23, 1),
    ('Сливки', 80, 'Сливки 20%', 50, '2024-03-15', 23, 1),
    ('Яйцо', 50, 'Куриное яйцо', 2, '2024-02-28', 23, 1),

    ('Водоросли нори', 150, 'Водоросли нори для суши', 5, '2024-03-25', 24, 1),
    ('Рис для суши', 40, 'Рис для суши', 100, '2024-03-30', 24, 1),
    ('Лосось', 800, 'Филе лосося свежее', 50, '2024-04-05', 24, 1),

    ('Рис', 30, 'Рис длиннозерный', 50, '2024-03-20', 26, 1),
    ('Авокадо', 100, 'Авокадо спелое', 30, '2024-04-10', 26, 2),
    ('Огурец', 40, 'Огурец свежий', 20, '2024-04-15', 26, 2),
    ('Икра летучей рыбы', 5000, 'Икра летучей рыбы красная', 10, '2024-04-20', 26, 1),

    ('Сыр моцарелла', 250, 'Сыр моцарелла тертый', 50, '2024-04-25', 27, 3),
    ('Тесто для пиццы', 60, 'Тесто для пиццы дрожжевое', 200, '2024-05-01', 27, 1),
    ('Томатный соус', 50, 'Томатный соус для пиццы', 100, '2024-05-05', 27, 1),

    ('Говяжья котлета', 400, 'Котлета говяжья жареная', 100, '2024-05-10', 28, 1),
    ('Булочка для бургера', 20, 'Булочка для бургера с кунжутом', 1, '2024-05-15', 28, 1),
    ('Картофель фри', 80, 'Картофель фри замороженный', 100, '2024-05-20', 28, 1),
    ('Кетчуп', 30, 'Кетчуп томатный', 10, '2024-05-25', 28, 1),

    ('Карри порошок', 70, 'Карри порошок для приготовления блюд', 5, '2024-05-30', 29, 4),
    ('Курица филе', 200, 'Куриное филе отварное', 150, '2024-06-05', 29, 1),

    /*Том Ям*/
    ('Креветки', 800, 'Креветки крупные', 100, '2024-02-25', 30, 1),
    ('Лимонграсс', 100, 'Лимонграсс свежий', 10, '2024-02-18', 30, 2),
    ('Грибы шиитаке', 300, 'Грибы шиитаке свежие', 50, '2024-02-23', 30, 2),
    ('Листья лайма', 50, 'Листья лайма свежие', 5, '2024-02-20', 30, 2),
    ('Чили', 40, 'Перец чили свежий', 5, '2024-02-15', 30, 4),
    ('Кокосовое молоко', 150, 'Кокосовое молоко', 200, '2024-02-10', 30, 1),
    ('Корень имбиря', 80, 'Имбирь свежий', 10, '2024-02-10', 30, 4),
    ('Кафир лайм', 70, 'Листья кафир лайма', 5, '2024-02-10', 30, 2),

    /*цезарь*/
    ('Куриное филе', 300, 'Куриное филе обжаренное', 150, '2024-02-10', 31, 1),
    ('Салат Римский', 80, 'Листья салата Римского', 50, '2024-02-12', 31, 2),
    ('Сыр Пармезан', 600, 'Сыр Пармезан тертый', 30, '2024-02-15', 31, 3),
    ('Хлеб', 50, 'Хлеб белый', 50, '2024-02-18', 31, 1),
    ('Чеснок', 120, 'Чеснок мелко нарезанный', 10, '2024-02-10', 31, 2),
    ('Оливковое масло', 200, 'Оливковое масло Extra Virgin', 20, '2024-02-20', 31, 1),
    ('Лимон', 80, 'Лимон свежий', 30, '2024-02-15', 31, 2),
    ('Перец черный молотый', 50, 'Перец черный молотый', 5, '2024-02-10', 31, 4),

    ('Баклажаны', 60, 'Баклажаны свежие', 50, '2024-06-10', 32, 2),
    ('Кабачки', 40, 'Кабачки свежие', 30, '2024-06-15', 32, 2),
    ('Помидоры', 80, 'Помидоры свежие для рагу', 40, '2024-06-20', 32, 2),
    ('Лук репчатый', 30, 'Лук репчатый нарезанный для рагу', 20, '2024-06-25', 32, 2),
    ('Морковь', 40, 'Морковь свежая нарезанная для рагу', 30, '2024-06-30', 32, 2),

    ('Баклажаны', 60, 'Баклажаны обжаренные для лагмана', 50, '2024-07-05', 33, 2),
    ('Перец сладкий', 50, 'Сладкий перец нарезанный для лагмана', 30, '2024-07-10', 33, 2),
    ('Морковь', 40, 'Морковь нарезанная для лагмана', 30,'2024-07-15' ,33 ,2),
    ('Лук репчатый' ,30 ,'Лук репчатый нарезанный для лагмана' ,20 ,'2024-07-20' ,33 ,2),
    ('Мясо баранины' ,500 ,'Мясо баранины нарезанное' ,150 ,'2024-07-25' ,33 ,1 ),

    /*котлета по киевски*/
    ('Курица', 200, 'Куриное филе', 150, '2024-02-28', 37, 1),
    ('Сливочное масло', 120, 'Сливочное масло', 20, '2024-02-25', 37, 1),
    ('Чеснок', 80, 'Чеснок свежий', 5, '2024-02-23', 37, 2),
    ('Петрушка', 30, 'Петрушка свежая', 5, '2024-02-20', 37, 2),
    ('Яйцо', 50, 'Куриное яйцо', 1, '2024-02-15', 37, 1),
    ('Мука', 40, 'Пшеничная мука', 50, '2024-02-10', 37, 1),
    ('Соль', 10, 'Поваренная соль', 5, '2024-02-10', 37, 4),

    ('Помидоры' ,80 ,'Помидоры свежие' ,50 ,'2024-08-01' ,38 ,2),
    ('Огурцы' ,40 ,'Огурцы свежие' ,30 ,'2024-08-05' ,38 ,2 ),
    ('Перец сладкий' ,50 ,'Сладкий перец нарезанный' ,20 ,'2024-08-10' ,38 ,2 ),
    ('Лук красный' ,40 ,'Лук красный мелко нарезанный' ,20 ,'2024-08-15' ,38 ,2 ),
    ('Чеснок', 60 ,'Чеснок мелко нарезанный' ,10 ,'2024-08-20', 38, 2)