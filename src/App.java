import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        /* header part end */

        GridPane headerRow1 = this.drawHeaderRow1();
        GridPane headerRow2 = this.drawHeaderRow2();
        GridPane title = this.drawTitle();
        GridPane mainForm1 = this.drawMainForm1();
        GridPane mainForm2 = this.drawMainForm2();
        GridPane mainForm3 = this.drawMainForm3();
        GridPane mainForm4 = this.drawMainForm4();
        GridPane mainForm5 = this.drawMainForm5();
        GridPane footer = this.drawFooter();

        Separator separator = new Separator();
        separator.setStyle("-fx-background-color: black; -fx-border-width: 2px; -fx-border-color: black;");
       
        Separator separator1 = new Separator();
        separator1.setStyle("-fx-background-color: black; -fx-border-width: 1px; -fx-border-color: black;");
       
        Separator separator2 = new Separator();
        separator2.setStyle("-fx-background-color: black; -fx-border-width: 0.1px; -fx-border-color: black;");
       
        Separator separator3 = new Separator();
        separator3.setStyle("-fx-background-color: black; -fx-border-width: 0.1px; -fx-border-color: black;");
       
        Separator separator4 = new Separator();
        separator4.setStyle("-fx-background-color: black; -fx-border-width: 0.1px; -fx-border-color: black;");
       
        // Create a ScrollPane and add the VBox to it
        VBox root = new VBox();
        root.setStyle("-fx-padding:20; ");
        root.getChildren().addAll(headerRow1, separator, headerRow2, separator1, title, mainForm1, mainForm2, mainForm3, separator2, mainForm4, separator3, mainForm5, separator4, footer);

        ScrollPane scrollPane = new ScrollPane(root);
        scrollPane.setPrefSize(920, 1000);

        StackPane view = new StackPane(scrollPane);
        Scene scene = new Scene(view, 920, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /* header part start */
    // header row 1
    public GridPane drawHeaderRow1() {

        GridPane headerRow1 = new GridPane();
        Text header_part = new Text("申請部署　→　人事部");
        header_part.setStyle("-fx-font-size:11pt; ");

        headerRow1.add(header_part, 0, 1);

        return headerRow1;
    }

    // header row 2
    public GridPane drawHeaderRow2() {
        // header row 2
        GridPane headerRow2 = new GridPane();
        headerRow2.setVgap(10);
        headerRow2.setHgap(10);

        // Adding the cells
        Text cell1 = new Text("");
        cell1.setStyle("-fx-font-size:11pt; ");
        headerRow2.add(cell1, 0, 0);

        Text cell2 = new Text("申請部署");
        cell2.setStyle("-fx-font-size:11pt; ");
        GridPane.setHalignment(cell2, HPos.CENTER);
        GridPane.setColumnSpan(cell2, 3);
        headerRow2.add(cell2, 1, 0);

        Text cell3 = new Text("  部長  ");
        cell3.setStyle("-fx-font-size:11pt; ");
        headerRow2.add(cell3, 1, 1);

        Text cell4 = new Text("  課長  ");
        cell4.setStyle("-fx-font-size:11pt; ");
        headerRow2.add(cell4, 2, 1);

        Text cell5 = new Text("  申請者  ");
        cell5.setStyle("-fx-font-size:11pt; ");
        headerRow2.add(cell5, 3, 1);

        Text cell6 = new Text("氏名");
        cell6.setStyle("-fx-font-size:11pt; ");
        headerRow2.add(cell6, 0, 2);

        TextField head_input_1 = new TextField();
        head_input_1.setPrefWidth(50);
        head_input_1.setStyle("-fx-font-size:11pt; ");
        headerRow2.add(head_input_1, 1, 2);

        TextField head_input_2 = new TextField();
        head_input_2.setPrefWidth(50);
        head_input_2.setStyle("-fx-font-size:11pt; ");
        headerRow2.add(head_input_2, 2, 2);

        TextField head_input_3 = new TextField();
        head_input_3.setPrefWidth(50);
        head_input_3.setStyle("-fx-font-size:11pt; ");
        headerRow2.add(head_input_3, 3, 2);

        Text head_date = new Text("  日\n  付");
        head_date.setStyle("-fx-font-size:11pt; ");
        GridPane.setRowSpan(head_date, 2);
        headerRow2.add(head_date, 0, 4);

        Text head_date1 = new Text("  承認日  ");
        head_date1.setStyle("-fx-font-size:11pt; ");
        headerRow2.add(head_date1, 1, 4);

        Text head_date2 = new Text("  承認日  ");
        head_date2.setStyle("-fx-font-size:11pt; ");
        headerRow2.add(head_date2, 2, 4);

        Text head_date3 = new Text("  作成日  ");
        head_date3.setStyle("-fx-font-size:11pt; ");
        headerRow2.add(head_date3, 3, 4);

        DatePicker head_input_4 = new DatePicker();
        head_input_4.setPrefWidth(120);
        head_input_4.setStyle("-fx-font-size:11pt; ");
        headerRow2.add(head_input_4, 1, 5);

        DatePicker head_input_5 = new DatePicker();
        head_input_5.setPrefWidth(120);
        head_input_5.setStyle("-fx-font-size:11pt; ");
        headerRow2.add(head_input_5, 2, 5);

        DatePicker head_input_6 = new DatePicker();
        head_input_6.setPrefWidth(120);
        head_input_6.setStyle("-fx-font-size:11pt; ");
        headerRow2.add(head_input_6, 3, 5);

        // Adding the cells
        Text head_arrow = new Text("\n=>");
        head_arrow.setStyle("-fx-font-size:16pt; ");
        GridPane.setValignment(head_arrow, VPos.CENTER);
        GridPane.setRowSpan(head_arrow, 5);
        headerRow2.add(head_arrow, 5, 0);

        Text head_text_2_1 = new Text(" 人事部 \n   部長");
        head_text_2_1.setStyle("-fx-font-size:11pt; ");
        GridPane.setValignment(head_text_2_1, VPos.CENTER);
        GridPane.setRowSpan(head_text_2_1, 2);
        headerRow2.add(head_text_2_1, 6, 0);

        TextField head_input_7 = new TextField();
        head_input_7.setPrefWidth(70);
        head_input_7.setStyle("-fx-font-size:11pt; ");
        headerRow2.add(head_input_7, 6, 2);

        TextArea head_input_8 = new TextArea();
        head_input_8.setPrefWidth(70);
        head_input_8.setStyle("-fx-font-size:11pt; ");
        GridPane.setRowSpan(head_input_8, 3);
        headerRow2.add(head_input_8, 6, 3);

        Text cell_last = new Text("･ﾍﾟｰﾊﾟｰﾚｽの為､承認を得た人とその日付を記入");
        cell_last.setStyle("-fx-font-size:11pt; ");
        GridPane.setHalignment(cell_last, HPos.CENTER);
        GridPane.setColumnSpan(cell_last, 6);
        headerRow2.add(cell_last, 0, 6);

        headerRow2.setMargin(cell1, new Insets(0, 0, 0, 300));
        headerRow2.setMargin(cell6, new Insets(0, 0, 0, 300));
        headerRow2.setMargin(head_date, new Insets(0, 0, 0, 300));
        headerRow2.setMargin(cell_last, new Insets(0, 0, 0, 300));

        return headerRow2;
    }
    /* header part end */

    /* main part start */
    // title
    public GridPane drawTitle() {
        GridPane title = new GridPane();

        Text title_underline = new Text("在宅勤務申請書\n");
        title_underline.setStyle("-fx-font-size:18pt; "
                + "-fx-font:bold;"
                + "-fx-underline: true");
        GridPane.setHalignment(title_underline, HPos.CENTER);
        title.add(title_underline, 0, 0);

        Text title_undertext1 = new Text("在宅勤務規程に基づき、下記の通り在宅勤務を申請します");
        title_undertext1.setStyle("-fx-font-size:11pt; ");
        GridPane.setHalignment(title_undertext1, HPos.CENTER);
        title.add(title_undertext1, 0, 2);

        Text title_undertext2 = new Text("（部署変更、在宅勤務場所の移動・変更時、速やかに再申請の事）");
        title_undertext2.setStyle("-fx-font-size:11pt; ");
        GridPane.setHalignment(title_undertext2, HPos.CENTER);
        title.add(title_undertext2, 0, 3);

        title.setMargin(title_underline, new Insets(-150, 0, 0, 200));
        title.setMargin(title_undertext1, new Insets(-100, 0, 0, 200));
        title.setMargin(title_undertext2, new Insets(-55, 0, 0, 200));

        return title;
    }

    // main form 1
    public GridPane drawMainForm1() {
        GridPane mainForm1 = new GridPane();
        Text mainform_head = new Text("申請者記入欄");
        mainform_head.setStyle("-fx-font-size:11pt; ");
        mainForm1.add(mainform_head, 0, 0);

        // line one
        Text mainform_1_date = new Text("\n申 請 日\n");
        mainform_1_date.setStyle("-fx-font-size:11pt; ");
        mainForm1.add(mainform_1_date, 0, 1);

        TextField mainform_1_date_input_year = new TextField();
        mainform_1_date_input_year.setPrefWidth(120);
        mainform_1_date_input_year.setStyle("-fx-font-size:11pt; ");
        mainForm1.add(mainform_1_date_input_year, 1, 1);

        Text mainform_1_date_year = new Text(" 年");
        mainform_1_date_year.setStyle("-fx-font-size:11pt; ");
        mainForm1.add(mainform_1_date_year, 2, 1);

        TextField mainform_1_date_input_month = new TextField();
        mainform_1_date_input_month.setPrefWidth(120);
        mainform_1_date_input_month.setStyle("-fx-font-size:11pt; ");
        mainForm1.add(mainform_1_date_input_month, 3, 1);

        Text mainform_1_date_month = new Text(" 月");
        mainform_1_date_month.setStyle("-fx-font-size:11pt; ");
        mainForm1.add(mainform_1_date_month, 4, 1);

        TextField mainform_1_date_input_day = new TextField();
        mainform_1_date_input_day.setPrefWidth(120);
        mainform_1_date_input_day.setStyle("-fx-font-size:11pt; ");
        mainForm1.add(mainform_1_date_input_day, 5, 1);

        Text mainform_1_date_day = new Text(" 日");
        mainform_1_date_day.setStyle("-fx-font-size:11pt; ");
        mainForm1.add(mainform_1_date_day, 6, 1);

        // line two
        Text mainform_content = new Text("\n申請内容");
        mainform_content.setStyle("-fx-font-size:11pt; ");
        GridPane.setRowSpan(mainform_content, 2);
        mainForm1.add(mainform_content, 0, 2);

        Label mainform_content_detail = new Label("該当以外を削除する。");
        mainform_content_detail.setStyle("-fx-font-size:9pt; ");
        GridPane.setColumnSpan(mainform_content_detail, 2);
        mainForm1.add(mainform_content_detail, 1, 2);

        // line three
        ToggleGroup mainform1_radio_group = new ToggleGroup();
        RadioButton button1 = new RadioButton("新規");
        button1.setStyle("-fx-font-size:11pt; ");
        RadioButton button2 = new RadioButton("勤務場所の変更");
        button2.setStyle("-fx-font-size:11pt; ");

        button1.setToggleGroup(mainform1_radio_group);
        button2.setToggleGroup(mainform1_radio_group);

        HBox hbox = new HBox();
        hbox.setSpacing(200);
        hbox.getChildren().addAll(button1, button2);
        GridPane.setColumnSpan(hbox, 5);
        mainForm1.add(hbox, 1, 3);

        // line four
        Text mainform_name = new Text("\n氏　　名\n");
        mainform_name.setStyle("-fx-font-size:11pt; ");
        mainForm1.add(mainform_name, 0, 4);

        TextField mainform_input_name = new TextField();
        mainform_input_name.setPrefWidth(120);
        mainform_input_name.setStyle("-fx-font-size:11pt; ");
        mainForm1.add(mainform_input_name, 1, 4);

        Text mainform_job = new Text("\n職　　場\n");
        mainform_job.setStyle("-fx-font-size:11pt; ");
        mainForm1.add(mainform_job, 3, 4);

        TextField mainform_input_job = new TextField();
        mainform_input_job.setPrefWidth(120);
        mainform_input_job.setStyle("-fx-font-size:11pt; ");
        GridPane.setColumnSpan(mainform_input_job, 2);
        mainForm1.add(mainform_input_job, 4, 4);

        // line five
        Text mainform_worker_code = new Text("\n社員ｺｰﾄﾞ\n");
        mainform_worker_code.setStyle("-fx-font-size:11pt; ");
        mainForm1.add(mainform_worker_code, 0, 5);

        TextField mainform_worker_code_name = new TextField();
        mainform_worker_code_name.setPrefWidth(120);
        mainform_worker_code_name.setStyle("-fx-font-size:11pt; ");
        mainForm1.add(mainform_worker_code_name, 1, 5);

        Text mainform_role = new Text("\n役　　職\n");
        mainform_role.setStyle("-fx-font-size:11pt; ");
        mainForm1.add(mainform_role, 3, 5);

        TextField mainform_input_role = new TextField();
        mainform_input_role.setPrefWidth(120);
        mainform_input_role.setStyle("-fx-font-size:11pt; ");
        GridPane.setColumnSpan(mainform_input_role, 2);
        mainForm1.add(mainform_input_role, 4, 5);

        // set margin
        mainForm1.setMargin(mainform_head, new Insets(10, 0, 0, 30));
        mainForm1.setMargin(mainform_1_date, new Insets(0, 0, 0, 30));
        mainForm1.setMargin(mainform_content, new Insets(0, 0, 0, 30));
        mainForm1.setMargin(mainform_name, new Insets(0, 0, 0, 30));
        mainForm1.setMargin(mainform_worker_code, new Insets(0, 0, 0, 30));
        
        mainForm1.setMargin(mainform_1_date_input_year, new Insets(0, 0, 0, 100));
        mainForm1.setMargin(mainform_1_date_input_month, new Insets(0, 0, 0, 50));
        mainForm1.setMargin(mainform_1_date_input_day, new Insets(0, 0, 0, 80));
        mainForm1.setMargin(mainform_content_detail, new Insets(0, 0, 0, 150));
        mainForm1.setMargin(hbox, new Insets(0, 0, 0, 210));
        mainForm1.setMargin(mainform_job, new Insets(0, 0, 0, 60));
        mainForm1.setMargin(mainform_role, new Insets(0, 0, 0, 60));

        return mainForm1;
    }

    // main form 2
    public GridPane drawMainForm2() {
        GridPane mainform2 = new GridPane();
        // line one
        Text mainform2_work_place = new Text("在宅勤務\n\n     の\n\n業務場所\n");
        mainform2_work_place.setStyle("-fx-font-size:11pt; ");
        GridPane.setRowSpan(mainform2_work_place, 8);
        mainform2.add(mainform2_work_place, 0, 0);

        Text mainform2_place_name = new Text("場　所\n     ※1");
        mainform2_place_name.setStyle("-fx-font-size:11pt; ");
        mainform2.add(mainform2_place_name, 1, 0);

        Label mainform2_place_alarm = new Label("該当以外を削除。必要に応じ［　　］に詳細を入力する。");
        mainform2_place_alarm.setStyle("-fx-font-size:9pt; ");
        GridPane.setColumnSpan(mainform2_place_alarm, 2);
        mainform2.add(mainform2_place_alarm, 2, 0);

        Text mainform2_place_input_t1 = new Text("自宅 ・ その他　[名称：");
        mainform2_place_input_t1.setStyle("-fx-font-size:11pt; ");
        TextField mainform2_place_input = new TextField();
        mainform2_place_input.setStyle("-fx-font-size:10pt; ");
        mainform2_place_input.setPrefWidth(300);
        Text mainform2_place_input_t2 = new Text("]");
        mainform2_place_input_t2.setStyle("-fx-font-size:11pt; ");

        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.getChildren().addAll(mainform2_place_input_t1, mainform2_place_input, mainform2_place_input_t2);
        GridPane.setColumnSpan(hbox, 5);
        mainform2.add(hbox, 3, 1);

        Label mainform2_place_detail_alarm = new Label("上記施設内の実際に業務を行う具体的場所");
        mainform2_place_detail_alarm.setStyle("-fx-font-size:9pt; ");
        GridPane.setColumnSpan(mainform2_place_detail_alarm, 2);
        mainform2.add(mainform2_place_detail_alarm, 3, 2);

        TextField mainform2_place_detail_input = new TextField();
        mainform2_place_detail_input.setStyle("-fx-font-size:11pt; ");
        mainform2_place_detail_input.setPromptText("記入例：２階の書斎	");
        mainform2.add(mainform2_place_detail_input, 3, 3);

        Text mainform2_position_name = new Text("所在地");
        mainform2_position_name.setStyle("-fx-font-size:11pt; ");
        mainform2.add(mainform2_position_name, 1, 4);

        TextField mainform2_position_input = new TextField();
        mainform2_position_input.setStyle("-fx-font-size:11pt; ");
        mainform2.add(mainform2_position_input, 3, 4);

        Text mainform2_connect_name = new Text("電話番号");
        mainform2_connect_name.setStyle("-fx-font-size:11pt; ");
        mainform2.add(mainform2_connect_name, 1, 5);

        TextField mainform2_connect_input = new TextField();
        mainform2_connect_input.setStyle("-fx-font-size:11pt; ");
        mainform2_connect_input.setPromptText("在宅勤務中、緊急時に対応可能な連絡先");
        mainform2_connect_input.setPrefWidth(450);
        mainform2.add(mainform2_connect_input, 3, 5);
       
        // set margin
        mainform2.setMargin(mainform2_work_place, new Insets(0, 0, 0, 30));
        mainform2.setMargin(mainform2_place_name, new Insets(30, 0, 0, 60));
        mainform2.setMargin(mainform2_place_alarm, new Insets(-30, 0, 0, 50));
        mainform2.setMargin(hbox, new Insets(-30, 0, 0, 90));
        mainform2.setMargin(mainform2_place_detail_alarm, new Insets(0, 0, 0, 50));
        mainform2.setMargin(mainform2_place_detail_input, new Insets(0, 0, 0, 60));
        mainform2.setMargin(mainform2_position_name, new Insets(10, 0, 0, 60));
        mainform2.setMargin(mainform2_position_input, new Insets(10, 0, 0, 60));
        mainform2.setMargin(mainform2_connect_name, new Insets(10, 0, 0, 60));
        mainform2.setMargin(mainform2_connect_input, new Insets(10, 0, 0, 60));

        return mainform2;
    }

    // main form 3
    public GridPane drawMainForm3() {
        GridPane mainform3 = new GridPane();
        Text mainform3_work_mission = new Text("在宅勤務\nで行う\n業務内容");
        mainform3_work_mission.setStyle("-fx-font-size:11pt; ");
        mainform3.add(mainform3_work_mission, 0, 0);

        TextArea mainform3_work_mission_area = new TextArea();
        mainform3_work_mission_area.setPrefWidth(600);
        mainform3_work_mission_area.setPrefHeight(60);
        mainform3.add(mainform3_work_mission_area, 1, 0);

        Text mainform3_out_machine = new Text("持出機器");
        mainform3_out_machine.setStyle("-fx-font-size:11pt; ");
        mainform3.add(mainform3_out_machine, 0, 1);

        TextArea mainform3_out_machine_area = new TextArea();
        mainform3_out_machine_area.setPrefWidth(600);
        mainform3_out_machine_area.setPrefHeight(60);
        mainform3.add(mainform3_out_machine_area, 1, 1);

        Text mainform3_out_book = new Text("持出書類");
        mainform3_out_book.setStyle("-fx-font-size:11pt; ");
        mainform3.add(mainform3_out_book, 0, 2);

        TextArea mainform3_out_book_area = new TextArea();
        mainform3_out_book_area.setPrefWidth(600);
        mainform3_out_book_area.setPrefHeight(60);
        mainform3.add(mainform3_out_book_area, 1, 2);

        // set margin
        mainform3.setMargin(mainform3_work_mission, new Insets(10, 0, 0, 30));
        mainform3.setMargin(mainform3_work_mission_area, new Insets(10, 0, 0, 30));
        mainform3.setMargin(mainform3_out_machine, new Insets(10, 0, 0, 30));
        mainform3.setMargin(mainform3_out_machine_area, new Insets(10, 0, 0, 30));
        mainform3.setMargin(mainform3_out_book, new Insets(10, 0, 0, 30));
        mainform3.setMargin(mainform3_out_book_area, new Insets(10, 0, 10, 30));

        return mainform3;
    }

    // main form 4
    public GridPane drawMainForm4() {
        GridPane mainform4 = new GridPane();

        Text mainform4_checkback = new Text("裏面の内容を確認後、");
        mainform4_checkback.setStyle("-fx-font-size:11pt; ");
        CheckBox c1 = new CheckBox("へ✔をすること");
        c1.setStyle("-fx-font-size:11pt; ");

        HBox hbox1 = new HBox();
        hbox1.setSpacing(10);
        hbox1.getChildren().addAll(mainform4_checkback, c1);
        mainform4.add(hbox1, 0, 0);

        CheckBox c2 = new CheckBox("情報セキュリティ、作業環境について、内容を確認しました");
        c2.setStyle("-fx-font-size:11pt; ");
        mainform4.add(c2, 0, 1);

        Text mainform4_heads_name = new Text("申請部署 課長又は部長（氏名:");
        mainform4_heads_name.setStyle("-fx-font-size:11pt; ");
        TextField mainform4_heads_name_input = new TextField();
        Text mainform4_heads_name_form = new Text(") 記入欄");
        mainform4_heads_name_form.setStyle("-fx-font-size:11pt; ");

        HBox hbox2 = new HBox();
        hbox2.setSpacing(10);
        hbox2.getChildren().addAll(mainform4_heads_name, mainform4_heads_name_input, mainform4_heads_name_form);
        mainform4.add(hbox2, 0, 2);
        //
        Text mainform4_checkback3 = new Text("以下につき、該当する場合には");
        mainform4_checkback3.setStyle("-fx-font-size:11pt; ");
        CheckBox c3 = new CheckBox("に✔をする");
        c3.setStyle("-fx-font-size:11pt; ");

        HBox hbox3 = new HBox();
        hbox3.setSpacing(10);
        hbox3.getChildren().addAll(mainform4_checkback3, c3);
        mainform4.add(hbox3, 0, 3);

        CheckBox c4 = new CheckBox("申請者の情報セキュリティ、作業環境について、申請に基づき内容を確認しました。");
        c4.setStyle("-fx-font-size:11pt; ");
        mainform4.add(c4, 0, 4);

        mainform4.setMargin(hbox1, new Insets(10, 0, 0, 30));
        mainform4.setMargin(c2, new Insets(10, 0, 0, 30));
        mainform4.setMargin(hbox2, new Insets(30, 0, 0, 30));
        mainform4.setMargin(hbox3, new Insets(10, 0, 0, 30));
        mainform4.setMargin(c4, new Insets(10, 0, 10, 30));
        return mainform4;
    }

    // main form 5
    public GridPane drawMainForm5() {
        GridPane mainform5 = new GridPane();
        Text comments_title = new Text(
                "※1：自宅、単身赴任先住居、会社指定のｻﾃﾗｲﾄｵﾌｨｽ以外を業務場所とする場合には、\n         以下条件を満たし、所属長が認めた場所であること。");
        comments_title.setStyle("-fx-font-size:11pt; ");
        mainform5.add(comments_title, 0, 0);

        Text comments_details = new Text(
                "①勤務時間中、業務に専念できる場所\n②出社を命じられた際の対応が可能である場所 [当社通勤圏内(片道90分以内)]\n③自ら在宅勤務環境を整備できる場所（飲食店、ｺﾜｰｷﾝｸﾞｽﾍﾟｰｽ等は不可)");
        comments_details.setStyle("-fx-font-size:11pt; ");
        mainform5.add(comments_details, 0, 1);

        // set margins
        mainform5.setMargin(comments_title, new Insets(10, 0, 0, 30));
        mainform5.setMargin(comments_details, new Insets(0, 0, 10, 50));
        return mainform5;
    }

    //footer 
    public GridPane drawFooter(){
        GridPane footer = new GridPane();

        Text footer_content = new Text("提出先　　：koito-hr@koito.co.jp\n提出時件名：在宅勤務申請書提出\n本文：（不要）");
        footer_content.setStyle("-fx-font-size:11pt; ");
        footer.add(footer_content, 0,0);

        footer.setMargin(footer_content, new Insets(10, 0, 0, 30));
        return footer;
    }
}
