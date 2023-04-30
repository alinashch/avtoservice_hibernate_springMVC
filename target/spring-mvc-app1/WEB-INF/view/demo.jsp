<%--
  Created by IntelliJ IDEA.
  User: Alina
  Date: 28.12.2022
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <title>list</title>

</head>
<body>
<table id="paged">
    <thead>
    <tr>
        <th>Cell 1</th>
        <th>Cell 2</th>
        <th>Cell 3</th>
    </tr>
    </thead>

    <!-- СПРЯТАЛИ! //-->
    <tbody style="display: none">
    <tr><td>1</td><td>Some content</td><td>Some content more ... </td></tr>

    <!-- Много - много строк таблицы //-->

    <tr><td>35</td><td>Some content</td><td>Some content more ... </td></tr>
    </tbody>
    <tfoot>
    <tr>
        <td colspan="3"></td>
    </tr>
    </tfoot>
</table>
<script>
    pagedTable(
        /* Ссылка на рабочую таблицу */
        document.getElementById("paged"),
        /* Кол-во строк таблицы на "странице" */
        5,
        /* Конфигурация постраничной навигации */
        {
            /* Событие "после инициализации" - отработает только ОДИН РАЗ! */
            onAfterInit : function (table) {
                // Делаем данные опять видимыми
                table.tBodies[0].style.display = "";
            }
        }
    );
</script>
</body>
</html>