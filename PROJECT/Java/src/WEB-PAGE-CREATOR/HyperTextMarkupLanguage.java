/* 

* This is a software made by GTECH and is used to make different web pages quickly by giving the names of the files simply, it has four different parts to generate blank, simple, compound and complex web pages.

* Idea : Trishit Maji
* Date created : 03/10/2022
* Time : 12:05 A.M.
* Regions available : India

*/

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class HyperTextMarkupLanguage{

    @Target({
        ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR
    })
    @Retention(RetentionPolicy.RUNTIME)
    @interface TAG{}

    @TAG
    private static class BLANK{

        java.util.Scanner in = new java.util.Scanner(System.in);

        String HTML_FILE_NAME, CSS_FILE_NAME, JSON_FILE_NAME, JS_FILE_NAME;

        @TAG
        BLANK(){

            HTML_FILE_NAME = "";
            CSS_FILE_NAME = "";
            JSON_FILE_NAME = "";
            JS_FILE_NAME = "";

        }

        @TAG
        public void CSS() throws java.io.IOException{

            System.out.print("Enter CSS file name : ");
            CSS_FILE_NAME = in.nextLine();

            java.io.PrintWriter write = new java.io.PrintWriter(CSS_FILE_NAME + ".css");

            write.println("body{}");
            write.close();

        }

        @TAG
        public void JSON() throws java.io.IOException{

            System.out.print("Enter JSON file name : ");
            JSON_FILE_NAME = in.nextLine();

            java.io.PrintWriter write = new java.io.PrintWriter(JSON_FILE_NAME + ".json");

            write.println("""
            {
            }
            """);
            write.close();

        }

        @TAG
        public void JS() throws java.io.IOException{
            
            System.out.print("Enter JS file name : ");
            JS_FILE_NAME = in.nextLine();

            java.io.PrintWriter write = new java.io.PrintWriter(JS_FILE_NAME + ".js");

            write.println("import data from \'./" + JSON_FILE_NAME + ".json\' assert{type: 'json'};");
            write.println("\nconsole.log(data);");
            write.close();

        }

        @TAG
        public void HTML() throws java.io.IOException{

            System.out.print("Enter HTML file name : ");
            HTML_FILE_NAME = in.nextLine();

            java.io.PrintWriter write = new java.io.PrintWriter(HTML_FILE_NAME + ".html");

            write.println("""
            <!DOCTYPE html>
            <html lang=\"en\">
            <head>
                <meta charset=\"UTF-8\">
                <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">
                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
            """);

            write.println("<link rel=\"stylesheet\" href=\""+ CSS_FILE_NAME +".css\">");
            write.println("""
            <title>Document</title>
            </head>
            <body>
            """);

            write.println("<script type=\"module\" src=\"./" + JS_FILE_NAME + ".js\"></script>");
            write.println("""
            </body>
            </html>
            """);

            write.close();

        }
    }

    @TAG
    private static class SIMPLE{

        java.util.Scanner in = new java.util.Scanner(System.in);

        String HTML_FILE_NAME, CSS_FILE_NAME, JSON_FILE_NAME, JS_FILE_NAME;

        @TAG
        SIMPLE(){

            HTML_FILE_NAME = "";
            CSS_FILE_NAME = "";
            JSON_FILE_NAME = "";
            JS_FILE_NAME = "";

        }

        @TAG
        public void CSS() throws java.io.IOException{

            System.out.print("Enter CSS file name : ");
            CSS_FILE_NAME = in.nextLine();

            java.io.PrintWriter write = new java.io.PrintWriter(CSS_FILE_NAME + ".css");

            write.println("""
            .head{
                height: 80px;
                background-color: rgb(255, 255, 255);
                border-bottom: 2px solid rgb(0, 0, 0);
                position: fixed;
                top: 0;
                left: 0;
                right: 0;
            }

            .buttons{
                display: flex;
                flex-direction: row;
            }

            .button{
                height: 80px;
                width: 80px;
                display: flex;
                flex-direction: column;
                justify-content: center;
                text-align: center;
            }

            .hover:hover{
                background-color: rgb(150, 150, 150);
                color: rgb(255, 0, 0);
            }

            h1{
                color: rgb(255, 0, 0);
            }

            p{
                text-align: justify;
            }
            """);
            write.close();

        }

        @TAG
        public void JSON() throws java.io.IOException{

            System.out.print("Enter JSON file name : ");
            JSON_FILE_NAME = in.nextLine();

            java.io.PrintWriter write = new java.io.PrintWriter(JSON_FILE_NAME + ".json");

            write.println("""
            {
                \"name\" : \"Trishit\",
                \"age\" : 16,
                \"gender\" : \"Male\"
            }
            """);
            write.close();

        }

        @TAG
        public void JS() throws java.io.IOException{
            
            System.out.print("Enter JS file name : ");
            JS_FILE_NAME = in.nextLine();

            java.io.PrintWriter write = new java.io.PrintWriter(JS_FILE_NAME + ".js");

            write.println("import data from \'./" + JSON_FILE_NAME + ".json\' assert{type : 'json'};");
            write.println("""
            console.log(\"Name : \" + data.name);
            console.log(\"Age : \" + data.age);
            console.log(\"Gender : \" + data.gender);
            """);
            write.close();

        }

        @TAG
        public void HTML() throws java.io.IOException{

            System.out.print("Enter HTML file name : ");
            HTML_FILE_NAME = in.nextLine();

            java.io.PrintWriter write = new java.io.PrintWriter(HTML_FILE_NAME + ".html");

            write.println("""
            <!DOCTYPE html>
            <html lang=\"en\">
            <head>
                <meta charset=\"UTF-8\">
                <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">
                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
            """);

            write.println("<link rel=\"stylesheet\" href=\"" + CSS_FILE_NAME + ".css\">");
            write.println("""
                <title>Home</title>
            </head>
            <body>
                <header>
                    <div class=\"head\">
                        <div class=\"buttons\">
                            <a href=\"#\" class=\"hover\">
                                <div class=\"button\">HOME</div>
                            </a>
                            <a href=\"#\" class=\"hover\">
                                <div class=\"button\">ABOUT</div>
                            </a>
                            <a href=\"#\" class=\"hover\">
                                <div class=\"button\">LOGIN</div>
                            </a>
                        </div>
                    </div>
                </header>
                <br><br><br><br>
                <h1>Lorem ipsum dolor sit.</h1>
                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Cumque sed provident labore aperiam maiores id fuga voluptates odit vel. Dolorem pariatur, nesciunt hic modi est incidunt quo, adipisci similique aut nostrum quam repudiandae! Eos nemo nisi officia eaque! Consequuntur fuga cumque autem, fugit sint eius suscipit nam aperiam adipisci aliquam quos odit natus incidunt error aliquid maxime placeat quasi dolores quam. Dignissimos quae cupiditate sint nam optio totam commodi aspernatur consequatur tempore cumque. Autem molestias aut mollitia! Corporis, culpa!

                <p>A nesciunt iusto voluptates, amet nam accusamus labore perspiciatis numquam eius sed provident quae dolorum, enim vero doloremque animi soluta. Cupiditate, ut voluptatum nisi assumenda suscipit perspiciatis quisquam autem, quod saepe maxime aliquam rem labore inventore odio nemo magnam aperiam provident deleniti doloremque a neque! Reprehenderit iste expedita perferendis commodi obcaecati aliquid dignissimos ipsam vitae voluptate asperiores repellat odit pariatur alias nam fugiat assumenda neque eius dolore esse, quis doloribus?</p>
                
                <p>Temporibus laudantium voluptas deserunt deleniti ab cumque rem eligendi aut ex sequi, quidem praesentium cupiditate. Excepturi culpa quos iure inventore cumque nihil vero illum eos. Est doloremque reprehenderit qui atque architecto culpa soluta et fugit repudiandae, doloribus numquam reiciendis ipsum voluptatibus excepturi nihil, corporis quaerat molestiae corrupti tempora! Voluptatem fugit illum maxime ea, mollitia aliquam doloribus quibusdam accusamus sit rerum, officiis aspernatur harum quasi, rem minus enim laboriosam. Sint adipisci quaerat quibusdam cum, totam officiis suscipit omnis id recusandae reiciendis culpa in placeat inventore perferendis itaque velit sunt expedita aperiam ipsa! Nihil maxime non suscipit incidunt aspernatur enim neque dignissimos totam vitae consequatur! Assumenda modi molestias nihil numquam laboriosam ullam consequuntur.</p>

                <p>Saepe ipsum maiores modi recusandae magni nostrum non rem inventore eligendi, nulla, ducimus dolores, porro nesciunt temporibus ut esse eius nisi obcaecati deleniti. Quo expedita delectus iusto facere quod corrupti perferendis vel ipsum maxime suscipit, dolorem nulla est corporis molestiae.</p>
            """);

            write.println("\t<script type=\"module\" src=\"./" + JS_FILE_NAME + ".js\"></script>");
            write.println("""
            </body>
            </html>
            """);

            write.close();

        }        
    }

    @TAG
    private static class COMPOUND{

        java.util.Scanner in = new java.util.Scanner(System.in);

        String HTML_FILE_NAME1, HTML_FILE_NAME2, HTML_FILE_NAME3 , CSS_FILE_NAME, JSON_FILE_NAME, JS_FILE_NAME;

        @TAG
        COMPOUND(){

            HTML_FILE_NAME1 = "";
            HTML_FILE_NAME2 = "";
            HTML_FILE_NAME3 = "";
            CSS_FILE_NAME = "";
            JSON_FILE_NAME = "";
            JS_FILE_NAME = "";

        }

        @TAG
        public void CSS() throws java.io.IOException{

            System.out.print("Enter CSS file name : ");
            CSS_FILE_NAME = in.nextLine();

            java.io.PrintWriter write = new java.io.PrintWriter(CSS_FILE_NAME + ".css");

            write.println("""
            .head{
                height: 80px;
                background-color: rgb(255, 255, 255);
                border-bottom: 2px solid rgb(0, 0, 0);
                position: fixed;
                top: 0;
                left: 0;
                right: 0;
            }

            .buttons{
                display: flex;
                flex-direction: row;
            }

            ._buttons{
                height: 80px;
                width: 80px;
                display: flex;
                flex-direction: column;
                justify-content: center;
                text-align: center;
            }

            .hover:hover{
                background-color: rgb(150, 150, 150);
                color: rgb(255, 0, 0);
            }

            h1{
                color: rgb(255, 0, 0);
            }

            p{
                text-align: justify;
            }

            .login{
                width: 300px;
                height: 30px;
                border:2px solid rgb(255, 0, 0);
                font-size: 20px;
            }

            .button{
                border: 2px solid rgb(255, 0, 0);
                border-radius: 1cm;
                cursor: pointer;
                width: 110px;
            }

            form{
                font-size: 20px;
            }
            """);
            write.close();

        }

        @TAG
        public void JSON() throws java.io.IOException{

            System.out.print("Enter JSON file name : ");
            JSON_FILE_NAME = in.nextLine();

            java.io.PrintWriter write = new java.io.PrintWriter(JSON_FILE_NAME + ".json");

            write.println("""
            {
                \"name" : "Trishit\",
                \"age\" : 16,
                \"gender\" : \"Male\",
                \"work\" : [\"Programmer\", \"Web developer\", \"Software engineer\"],
                \"contact\" : [\"trishit2006.ig@gmail.com\", \"@ig_trishit_2006\"]
            }
            """);
            write.close();

        }

        @TAG
        public void JS() throws java.io.IOException{
            
            System.out.print("Enter JS file name : ");
            JS_FILE_NAME = in.nextLine();

            java.io.PrintWriter write = new java.io.PrintWriter(JS_FILE_NAME + ".js");

            write.println("import data from \'./" + JSON_FILE_NAME + ".json\' assert{type : 'json'};");
            write.println("""
            console.log(\"Name : \" + data.name);
            console.log(\"Age : \" + data.age);
            console.log(\"Gender : \" + data.gender);
            console.log(\"Work : \"+ data.work[0] + \", \" + data.work[1] + \", \" + data.work[2]);
            console.log(\"Contact : \" + data.contact);
            """);
            write.close();

        }

        @TAG
        public void HTML() throws java.io.IOException{

            System.out.print("Enter index HTML file name : ");
            HTML_FILE_NAME1 = in.nextLine();
            java.io.PrintWriter write1 = new java.io.PrintWriter(HTML_FILE_NAME1 + ".html");

            System.out.print("Enter about HTML file name : ");
            HTML_FILE_NAME2 = in.nextLine();
            java.io.PrintWriter write2 = new java.io.PrintWriter(HTML_FILE_NAME2 + ".html");

            System.out.print("Enter login HTML file name : ");
            HTML_FILE_NAME3 = in.nextLine();
            java.io.PrintWriter write3 = new java.io.PrintWriter(HTML_FILE_NAME3 + ".html");

            write3.println("""
            <!DOCTYPE html>
            <html lang=\"en\">
            <head>
                <meta charset=\"UTF-8\">
                <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">
                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
                <link rel=\"stylesheet\" href=\"style.css\">
                <title>Login</title>
            </head>
            <body>
                <header>
                    <div class=\"head\">
                        <div class=\"buttons\">
            """);

            write3.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME1 + ".html\" class=\"hover\">");
            write3.println("""
                                <div class=\"_buttons\">HOME</div>
                            </a>
            """);

            write3.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME2 + ".html\" class=\"hover\">");
            write3.println("""
                                <div class=\"_buttons\">ABOUT</div>
                            </a>
            """);

            write3.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME3 + ".html\" class=\"hover\">");
            write3.println("""
                                <div class=\"_buttons\">LOGIN</div>
                            </a>
                        </div>
                    </div>
                </header>
                <br><br><br><br>
                <h1>Login :</h1>
                <form>
                    Name : <input type=\"text\" name=\"name\" class=\"login\">
                    <button type=\"reset\" class=\"button\">RESET</button>
                    <br><br>
                    Email : <input type=\"email\" name=\"mail\" class=\"login\">
                    <button type=\"reset\" class=\"button\">RESET</button>
                    <br><br>
                    Password : <input type=\"password\" name=\"pass\" class=\"login\">
                    <button type=\"reset\" class=\"button\">RESET</button>
                    <br><br>
                    Phone : <input type=\"number\" name=\"phone\" class=\"login\">
                    <button type=\"reset\" class=\"button\">RESET</button>
                    <br><br>
                    Picture : <input type=\"file\" name=\"pic\">
                    <button type=\"reset\" class=\"button\">RESET</button>
                    <br><br>
                    <button type=\"submit\" class=\"button\">SUBMIT INFO</button>
                </form>
            </body>
            </html>
            """);

            write2.println("""
            <!DOCTYPE html>
            <html lang=\"en\">
            <head>
                <meta charset=\"UTF-8\">
                <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">
                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
                <link rel=\"stylesheet\" href=\"style.css\">
                <title>About</title>
            </head>
            <body>
                <header>
                    <div class=\"head\">
                        <div class=\"buttons\">
            """);

            write2.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME1 + ".html\" class=\"hover\">");
            write2.println("""
                                <div class=\"_buttons\">HOME</div>
                            </a>
            """);

            write2.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME2 + ".html\" class=\"hover\">");
            write2.println("""
                                <div class=\"_buttons\">ABOUT</div>
                            </a>
            """);

            write2.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME3 + ".html\" class=\"hover\">");
            write2.println("""
                                <div class=\"_buttons\">LOGIN</div>
                            </a>
                        </div>
                    </div>
                </header>
                <br><br><br><br><br>
                <h1>About :</h1>
                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Cumque sed provident labore aperiam maiores id fuga voluptates odit vel. Dolorem pariatur, nesciunt hic modi est incidunt quo, adipisci similique aut nostrum quam repudiandae! Eos nemo nisi officia eaque! Consequuntur fuga cumque autem, fugit sint eius suscipit nam aperiam adipisci aliquam quos odit natus incidunt error aliquid maxime placeat quasi dolores quam. Dignissimos quae cupiditate sint nam optio totam commodi aspernatur consequatur tempore cumque. Autem molestias aut mollitia! Corporis, culpa!

                <p>A nesciunt iusto voluptates, amet nam accusamus labore perspiciatis numquam eius sed provident quae dolorum, enim vero doloremque animi soluta. Cupiditate, ut voluptatum nisi assumenda suscipit perspiciatis quisquam autem, quod saepe maxime aliquam rem labore inventore odio nemo magnam aperiam provident deleniti doloremque a neque! Reprehenderit iste expedita perferendis commodi obcaecati aliquid dignissimos ipsam vitae voluptate asperiores repellat odit pariatur alias nam fugiat assumenda neque eius dolore esse, quis doloribus?</p>
                
                <p>Temporibus laudantium voluptas deserunt deleniti ab cumque rem eligendi aut ex sequi, quidem praesentium cupiditate. Excepturi culpa quos iure inventore cumque nihil vero illum eos. Est doloremque reprehenderit qui atque architecto culpa soluta et fugit repudiandae, doloribus numquam reiciendis ipsum voluptatibus excepturi nihil, corporis quaerat molestiae corrupti tempora! Voluptatem fugit illum maxime ea, mollitia aliquam doloribus quibusdam accusamus sit rerum, officiis aspernatur harum quasi, rem minus enim laboriosam. Sint adipisci quaerat quibusdam cum, totam officiis suscipit omnis id recusandae reiciendis culpa in placeat inventore perferendis itaque velit sunt expedita aperiam ipsa! Nihil maxime non suscipit incidunt aspernatur enim neque dignissimos totam vitae consequatur! Assumenda modi molestias nihil numquam laboriosam ullam consequuntur.</p>

                <p>Saepe ipsum maiores modi recusandae magni nostrum non rem inventore eligendi, nulla, ducimus dolores, porro nesciunt temporibus ut esse eius nisi obcaecati deleniti. Quo expedita delectus iusto facere quod corrupti perferendis vel ipsum maxime suscipit, dolorem nulla est corporis molestiae.</p>
            </body>
            </html>
            """);

            write1.println("""
            <!DOCTYPE html>
            <html lang=\"en\">
            <head>
                <meta charset=\"UTF-8\">
                <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">
                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
            """);

            write1.println("<link rel=\"stylesheet\" href=\"" + CSS_FILE_NAME + ".css\">");
            write1.println("""
                <title>Home</title>
            </head>
            <body>
                <header>
                    <div class=\"head\">
                        <div class=\"buttons\">
            """);

            write1.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME1 + ".html\" class=\"hover\">");
            write1.println("""
                                <div class=\"_buttons\">HOME</div>
                            </a>
            """);
            
            write1.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME2 + ".html\" class=\"hover\">");
            write1.println("""
                                <div class=\"_buttons\">ABOUT</div>
                            </a>
            """);

            write1.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME3 + ".html\" class=\"hover\">");
            write1.println("""
                                <div class=\"_buttons\">LOGIN</div>
                            </a>
                        </div>
                    </div>
                </header>
                <br><br><br><br>
                <h1>Home :</h1>
                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Cumque sed provident labore aperiam maiores id fuga voluptates odit vel. Dolorem pariatur, nesciunt hic modi est incidunt quo, adipisci similique aut nostrum quam repudiandae! Eos nemo nisi officia eaque! Consequuntur fuga cumque autem, fugit sint eius suscipit nam aperiam adipisci aliquam quos odit natus incidunt error aliquid maxime placeat quasi dolores quam. Dignissimos quae cupiditate sint nam optio totam commodi aspernatur consequatur tempore cumque. Autem molestias aut mollitia! Corporis, culpa!

                <p>A nesciunt iusto voluptates, amet nam accusamus labore perspiciatis numquam eius sed provident quae dolorum, enim vero doloremque animi soluta. Cupiditate, ut voluptatum nisi assumenda suscipit perspiciatis quisquam autem, quod saepe maxime aliquam rem labore inventore odio nemo magnam aperiam provident deleniti doloremque a neque! Reprehenderit iste expedita perferendis commodi obcaecati aliquid dignissimos ipsam vitae voluptate asperiores repellat odit pariatur alias nam fugiat assumenda neque eius dolore esse, quis doloribus?</p>
                
                <p>Temporibus laudantium voluptas deserunt deleniti ab cumque rem eligendi aut ex sequi, quidem praesentium cupiditate. Excepturi culpa quos iure inventore cumque nihil vero illum eos. Est doloremque reprehenderit qui atque architecto culpa soluta et fugit repudiandae, doloribus numquam reiciendis ipsum voluptatibus excepturi nihil, corporis quaerat molestiae corrupti tempora! Voluptatem fugit illum maxime ea, mollitia aliquam doloribus quibusdam accusamus sit rerum, officiis aspernatur harum quasi, rem minus enim laboriosam. Sint adipisci quaerat quibusdam cum, totam officiis suscipit omnis id recusandae reiciendis culpa in placeat inventore perferendis itaque velit sunt expedita aperiam ipsa! Nihil maxime non suscipit incidunt aspernatur enim neque dignissimos totam vitae consequatur! Assumenda modi molestias nihil numquam laboriosam ullam consequuntur.</p>

                <p>Saepe ipsum maiores modi recusandae magni nostrum non rem inventore eligendi, nulla, ducimus dolores, porro nesciunt temporibus ut esse eius nisi obcaecati deleniti. Quo expedita delectus iusto facere quod corrupti perferendis vel ipsum maxime suscipit, dolorem nulla est corporis molestiae.</p>
            """);

            write1.println("\t<script type=\"module\" src=\"./" + JS_FILE_NAME + ".js\"></script>");
            write1.println("""
            </body>
            </html>
            """);

            write1.close();
            write2.close();
            write3.close();

        }
    }

    @TAG
    private static class COMPLEX{

        java.util.Scanner in = new java.util.Scanner(System.in);

        String HTML_FILE_NAME1, HTML_FILE_NAME2, HTML_FILE_NAME3 , CSS_FILE_NAME, JSON_FILE_NAME, JS_FILE_NAME;

        @TAG
        COMPLEX(){

            HTML_FILE_NAME1 = "";
            HTML_FILE_NAME2 = "";
            HTML_FILE_NAME3 = "";
            CSS_FILE_NAME = "";
            JSON_FILE_NAME = "";
            JS_FILE_NAME = "";

        }

        @TAG
        public void CSS() throws java.io.IOException{

            System.out.print("Enter CSS file name : ");
            CSS_FILE_NAME = in.nextLine();

            java.io.PrintWriter write = new java.io.PrintWriter(CSS_FILE_NAME + ".css");

            write.println("""
            html{
                background-color: rgb(0, 0, 0);
                color: white;
            }

            .head{
                height: 80px;
                background-color: rgb(0, 0, 0);
                border-bottom: 2px solid rgb(255, 255, 255);
                position: fixed;
                top: 0;
                left: 0;
                right: 0;
            }

            .buttons{
                display: flex;
                flex-direction: row;
            }

            ._buttons{
                height: 80px;
                width: 80px;
                display: flex;
                flex-direction: column;
                justify-content: center;
                text-align: center;
            }

            .hover{
                color: rgb(255, 255, 255);
            }

            .hover:hover{
                background-color: rgb(150, 150, 150);
                color: rgb(255, 0, 0);
            }

            h1{
                color: rgb(255, 0, 0);
            }

            p{
                text-align: justify;
            }

            .login{
                width: 300px;
                height: 30px;
                border:2px solid rgb(255, 0, 0);
                font-size: 20px;
                background-color: rgb(0, 0, 0);
                color: rgb(255, 255, 255);
            }

            .login:hover{
                border: 2px solid rgb(255, 255, 255);
            }

            .button{
                border: 2px solid rgb(255, 0, 0);
                border-radius: 1cm;
                cursor: pointer;
                width: 110px;
            }

            .button:hover{
                box-shadow: 0 0 10px rgb(255, 0, 0);

            }

            form{
                font-size: 20px;
            }

            .move{
                margin: 20px 350px;
                font-size: 30px;
            }

            .foot{
                background-color: rgb(0, 0, 0);
                height: 80px;
                border-top: 2px solid rgb(255, 255, 255);
                position: fixed;
                bottom: 0;
                left: 0;
                right: 0;
                color: rgb(255, 255, 255);
                display: flex;
                flex-direction: column;
                justify-content: center;
            }

            .middle{
                text-align: center;
            }

            .color{
                color: rgb(255, 255, 255);
            }
            """);
            write.close();

        }

        @TAG
        public void JSON() throws java.io.IOException{

            System.out.print("Enter JSON file name : ");
            JSON_FILE_NAME = in.nextLine();

            java.io.PrintWriter write = new java.io.PrintWriter(JSON_FILE_NAME + ".json");

            write.println("""
            {
                \"name\" : \"Trishit\",
                \"age\" : 16,
                \"gender\" : \"Male\",
                \"work\" : [\"Programmer\", \"Web developer\", \"Software engineer\"],
                \"contact\" : [\"trishit2006.ig@gmail.com\", \"@ig_trishit_2006\"],
                \"second_work\" : [\"Hacker\", \"Teacher\"],
                \"type\" : [\"Dog lover\"]
            }
            """);
            write.close();

        }

        @TAG
        public void JS() throws java.io.IOException{
            
            System.out.print("Enter JS file name : ");
            JS_FILE_NAME = in.nextLine();

            java.io.PrintWriter write = new java.io.PrintWriter(JS_FILE_NAME + ".js");

            write.println("import data from \'./" + JSON_FILE_NAME + ".json\' assert{type : 'json'};");
            write.println("""
            console.log(\"Name : \" + data.name);
            console.log(\"Age : \" + data.age);
            console.log(\"Gender : \" + data.gender);
            console.log(\"Work : \"+ data.work[0] + \", \" + data.work[1] + \", \" + data.work[2]);
            console.log(\"Contact : \" + data.contact);
            console.log(\"Second work : \" + data.second_work);
            console.log(\"Type : \" + data.type[0]);
            """);
            write.close();

        }

        @TAG
        public void HTML() throws java.io.IOException{

            System.out.print("Enter index HTML file name : ");
            HTML_FILE_NAME1 = in.nextLine();
            java.io.PrintWriter write1 = new java.io.PrintWriter(HTML_FILE_NAME1 + ".html");

            System.out.print("Enter about HTML file name : ");
            HTML_FILE_NAME2 = in.nextLine();
            java.io.PrintWriter write2 = new java.io.PrintWriter(HTML_FILE_NAME2 + ".html");

            System.out.print("Enter login HTML file name : ");
            HTML_FILE_NAME3 = in.nextLine();
            java.io.PrintWriter write3 = new java.io.PrintWriter(HTML_FILE_NAME3 + ".html");

            write3.println("""
            <!DOCTYPE html>
            <html lang=\"en\">
            <head>
                <meta charset=\"UTF-8\">
                <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">
                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
                <link rel=\"stylesheet\" href=\"style.css\">
                <title>Login</title>
            </head>
            <body>
                <header>
                    <div class=\"head\">
                        <div class=\"buttons\">
            """);

            write3.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME1 + ".html\" class=\"hover\">");
            write3.println("""
                                <div class=\"_buttons\">HOME</div>
                            </a>
            """);

            write3.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME2 + ".html\" class=\"hover\">");
            write3.println("""
                                <div class=\"_buttons\">ABOUT</div>
                            </a>
            """);

            write3.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME3 + ".html\" class=\"hover\">");
            write3.println("""
                                <div class=\"_buttons\">LOGIN</div>
                            </a>
                            <div class=\"move\">
                                <a style=\"color:red;\">There</a>
                                <a style=\"color:green;\">is</a>
                                <a style=\"color:blue;\">no</a>
                                <a style=\"color:purple;\">place</a>
                                <a style=\"color:cyan;\">like</a>
                                <a style=\"color:white; font-family: Consolas;\">127.0.0.1</a>
                            </div>
                        </div>
                    </div>
                </header>
                <br><br><br><br>
                <h1>Login :</h1>
                <form>
                    Name : <input type=\"text\" name=\"name\" class=\"login\">
                    <button type=\"reset\" class=\"button\">RESET</button>
                    <br><br>
                    Email : <input type=\"email\" name=\"mail\" class=\"login\">
                    <button type=\"reset\" class=\"button\">RESET</button>
                    <br><br>
                    Password : <input type=\"password\" name=\"pass\" class=\"login\">
                    <button type=\"reset\" class=\"button\">RESET</button>
                    <br><br>
                    Phone : <input type=\"number\" name=\"phone\" class=\"login\">
                    <button type=\"reset\" class=\"button\">RESET</button>
                    <br><br>
                    Birthday : <input type=\"date\" name=\"bday\">
                    <button type=\"reset\" class=\"button\">RESET</button>
                    <br><br>
                    Address : <input type=\"text\" name=\"addr\" class=\"login\">
                    <button type=\"reset\" class=\"button\">RESET</button>
                    <br><br>
                    Postal code : <input type=\"number\" name=\"post\" class=\"login\">
                    <button type=\"reset\" class=\"button\">RESET</button>
                    <button type=\"submit\" class=\"button\">SUBMIT INFO</button>
                </form>

                <footer>
                    <div class=\"foot\">
                        <div class=\"middle\">
                            Developer contact : <a href=\"mailto:trishit2006.ig@gmail.com\" class=\"color\">MAIL</a>
                        </div>
                        <div class=\"middle\">
                            Contact through instagram : <a href=\"https://www.instagram.com/ig_trishit_2006\" class=\"color\">CONTACT</a>
                        </div>
                    </div>
                </footer>

            </body>
            </html>
            """);

            write2.println("""
            <!DOCTYPE html>
            <html lang=\"en\">
            <head>
                <meta charset=\"UTF-8\">
                <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">
                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
                <link rel=\"stylesheet\" href=\"style.css\">
                <title>About</title>
            </head>
            <body>
                <header>
                    <div class=\"head\">
                        <div class=\"buttons\">
            """);

            write2.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME1 + ".html\" class=\"hover\">");
            write2.println("""
                                <div class=\"_buttons\">HOME</div>
                            </a>
            """);

            write2.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME2 + ".html\" class=\"hover\">");
            write2.println("""
                                <div class=\"_buttons\">ABOUT</div>
                            </a>
            """);

            write2.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME3 + ".html\" class=\"hover\">");
            write2.println("""
                                <div class=\"_buttons\">LOGIN</div>
                            </a>
                            <div class=\"move\">
                                <a style=\"color:red;\">There</a>
                                <a style=\"color:green;\">is</a>
                                <a style=\"color:blue;\">no</a>
                                <a style=\"color:purple;\">place</a>
                                <a style=\"color:cyan;\">like</a>
                                <a style=\"color:white; font-family: Consolas;\">127.0.0.1</a>
                            </div>
                        </div>
                    </div>
                </header>
                <br><br><br><br><br>
                <h1>About :</h1>
                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Cumque sed provident labore aperiam maiores id fuga voluptates odit vel. Dolorem pariatur, nesciunt hic modi est incidunt quo, adipisci similique aut nostrum quam repudiandae! Eos nemo nisi officia eaque! Consequuntur fuga cumque autem, fugit sint eius suscipit nam aperiam adipisci aliquam quos odit natus incidunt error aliquid maxime placeat quasi dolores quam. Dignissimos quae cupiditate sint nam optio totam commodi aspernatur consequatur tempore cumque. Autem molestias aut mollitia! Corporis, culpa!

                <p>A nesciunt iusto voluptates, amet nam accusamus labore perspiciatis numquam eius sed provident quae dolorum, enim vero doloremque animi soluta. Cupiditate, ut voluptatum nisi assumenda suscipit perspiciatis quisquam autem, quod saepe maxime aliquam rem labore inventore odio nemo magnam aperiam provident deleniti doloremque a neque! Reprehenderit iste expedita perferendis commodi obcaecati aliquid dignissimos ipsam vitae voluptate asperiores repellat odit pariatur alias nam fugiat assumenda neque eius dolore esse, quis doloribus?</p>
                
                <p>Temporibus laudantium voluptas deserunt deleniti ab cumque rem eligendi aut ex sequi, quidem praesentium cupiditate. Excepturi culpa quos iure inventore cumque nihil vero illum eos. Est doloremque reprehenderit qui atque architecto culpa soluta et fugit repudiandae, doloribus numquam reiciendis ipsum voluptatibus excepturi nihil, corporis quaerat molestiae corrupti tempora! Voluptatem fugit illum maxime ea, mollitia aliquam doloribus quibusdam accusamus sit rerum, officiis aspernatur harum quasi, rem minus enim laboriosam. Sint adipisci quaerat quibusdam cum, totam officiis suscipit omnis id recusandae reiciendis culpa in placeat inventore perferendis itaque velit sunt expedita aperiam ipsa! Nihil maxime non suscipit incidunt aspernatur enim neque dignissimos totam vitae consequatur! Assumenda modi molestias nihil numquam laboriosam ullam consequuntur.</p>

                <p>Saepe ipsum maiores modi recusandae magni nostrum non rem inventore eligendi, nulla, ducimus dolores, porro nesciunt temporibus ut esse eius nisi obcaecati deleniti. Quo expedita delectus iusto facere quod corrupti perferendis vel ipsum maxime suscipit, dolorem nulla est corporis molestiae.</p>

                <footer>
                    <div class=\"foot\">
                        <div class=\"middle\">
                            Developer contact : <a href=\"mailto:trishit2006.ig@gmail.com\" class=\"color\">MAIL</a>
                        </div>
                        <div class=\"middle\">
                            Contact through instagram : <a href=\"https://www.instagram.com/ig_trishit_2006\" class=\"color\">CONTACT</a>
                        </div>
                    </div>
                </footer>

            </body>
            </html>
            """);

            write1.println("""
            <!DOCTYPE html>
            <html lang=\"en\">
            <head>
                <meta charset=\"UTF-8\">
                <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">
                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
            """);

            write1.println("<link rel=\"stylesheet\" href=\"" + CSS_FILE_NAME + ".css\">");
            write1.println("""
                <title>Home</title>
            </head>
            <body>
                <header>
                    <div class=\"head\">
                        <div class=\"buttons\">
            """);

            write1.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME1 + ".html\" class=\"hover\">");
            write1.println("""
                                <div class=\"_buttons\">HOME</div>
                            </a>
            """);

            write1.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME2 + ".html\" class=\"hover\">");
            write1.println("""
                                <div class=\"_buttons\">ABOUT</div>
                            </a>
            """);

            write1.println("\t\t\t\t<a href=\"./" + HTML_FILE_NAME3 + ".html\" class=\"hover\">");
            write1.println("""
                                <div class=\"_buttons\">LOGIN</div>
                            </a>
                            <div class=\"move\">
                                <a style=\"color:red;\">There</a>
                                <a style=\"color:green;\">is</a>
                                <a style=\"color:blue;\">no</a>
                                <a style=\"color:purple;\">place</a>
                                <a style=\"color:cyan;\">like</a>
                                <a style=\"color:white; font-family: Consolas;\">127.0.0.1</a>
                            </div>
                        </div>
                    </div>
                </header>
                <br><br><br><br>
                <h1>Home :</h1>
                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Cumque sed provident labore aperiam maiores id fuga voluptates odit vel. Dolorem pariatur, nesciunt hic modi est incidunt quo, adipisci similique aut nostrum quam repudiandae! Eos nemo nisi officia eaque! Consequuntur fuga cumque autem, fugit sint eius suscipit nam aperiam adipisci aliquam quos odit natus incidunt error aliquid maxime placeat quasi dolores quam. Dignissimos quae cupiditate sint nam optio totam commodi aspernatur consequatur tempore cumque. Autem molestias aut mollitia! Corporis, culpa!

                <p>A nesciunt iusto voluptates, amet nam accusamus labore perspiciatis numquam eius sed provident quae dolorum, enim vero doloremque animi soluta. Cupiditate, ut voluptatum nisi assumenda suscipit perspiciatis quisquam autem, quod saepe maxime aliquam rem labore inventore odio nemo magnam aperiam provident deleniti doloremque a neque! Reprehenderit iste expedita perferendis commodi obcaecati aliquid dignissimos ipsam vitae voluptate asperiores repellat odit pariatur alias nam fugiat assumenda neque eius dolore esse, quis doloribus?</p>
                
                <p>Temporibus laudantium voluptas deserunt deleniti ab cumque rem eligendi aut ex sequi, quidem praesentium cupiditate. Excepturi culpa quos iure inventore cumque nihil vero illum eos. Est doloremque reprehenderit qui atque architecto culpa soluta et fugit repudiandae, doloribus numquam reiciendis ipsum voluptatibus excepturi nihil, corporis quaerat molestiae corrupti tempora! Voluptatem fugit illum maxime ea, mollitia aliquam doloribus quibusdam accusamus sit rerum, officiis aspernatur harum quasi, rem minus enim laboriosam. Sint adipisci quaerat quibusdam cum, totam officiis suscipit omnis id recusandae reiciendis culpa in placeat inventore perferendis itaque velit sunt expedita aperiam ipsa! Nihil maxime non suscipit incidunt aspernatur enim neque dignissimos totam vitae consequatur! Assumenda modi molestias nihil numquam laboriosam ullam consequuntur.</p>

                <p>Saepe ipsum maiores modi recusandae magni nostrum non rem inventore eligendi, nulla, ducimus dolores, porro nesciunt temporibus ut esse eius nisi obcaecati deleniti. Quo expedita delectus iusto facere quod corrupti perferendis vel ipsum maxime suscipit, dolorem nulla est corporis molestiae.</p>
            """);

            write1.println("\t<script type=\"module\" src=\"./" + JS_FILE_NAME + ".js\"></script>");
            write1.println("""
                <footer>
                    <div class=\"foot\">
                        <div class=\"middle\">
                            Developer contact : <a href=\"mailto:trishit2006.ig@gmail.com\" class=\"color\">MAIL</a>
                        </div>
                        <div class=\"middle\">
                            Contact through instagram : <a href=\"https://www.instagram.com/ig_trishit_2006\" class=\"color\">CONTACT</a>
                        </div>
                    </div>
                </footer>
            </body>
            </html>
            """);

            write1.close();
            write2.close();
            write3.close();

        }
    }

    @TAG
    private static void SHOW() throws java.io.IOException{

        BLANK _ob_ = new BLANK();
        SIMPLE __ob__ = new SIMPLE();
        COMPOUND ___ob___ = new COMPOUND();
        COMPLEX ____ob____ = new COMPLEX();

        System.out.println("""
        This software is a web page generator made by GTECH, please do the given steps to generate the same.
        Made by : Trishit Maji
        Regions available : India

        Enter BLANK to generate a blank web page.
        Enter SIMPLE to generate a simple web page.
        Enter COMPOUND to generate a compound web page.
        Enter COMPLEX to generate a complex web page.
        """);

        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.print("Enter your choice : ");
        String GENERATE = in.nextLine();
        if(GENERATE.equalsIgnoreCase("BLANK")){

            _ob_.CSS();
            _ob_.JSON();
            _ob_.JS();
            _ob_.HTML();
            System.out.println("Thank you for using our software and please do share it with other web developers to help them make web sites more comfortably.");

        } if (GENERATE.equalsIgnoreCase("SIMPLE")){

            __ob__.CSS();
            __ob__.JSON();
            __ob__.JS();
            __ob__.HTML();
            System.out.println("Thank you for using our software and please do share it with other web developers to help them make web sites more comfortably.");

        } if (GENERATE.equalsIgnoreCase("COMPOUND")){

            ___ob___.CSS();
            ___ob___.JSON();
            ___ob___.JS();
            ___ob___.HTML();
            System.out.println("Thank you for using our software and please do share it with other web developers to help them make web sites more comfortably.");

        } if (GENERATE.equalsIgnoreCase("COMPLEX")){

            ____ob____.CSS();
            ____ob____.JSON();
            ____ob____.JS();
            ____ob____.HTML();
            System.out.println("Thank you for using our software and please do share it with other web developers to help them make web sites more comfortably.");

        }
    }

    @TAG
    public void main() throws java.io.IOException {

        SHOW();

    }
}