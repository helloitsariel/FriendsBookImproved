package com.example.friendsbook;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import java.io.*;
import java.util.ArrayList;

public class HelloController {
    public TextField firstNamePrompt;
    public TextField lastNamePrompt;
    public TextField nicknamePrompt;
    public TextField agePrompt;
    public TextField contactPrompt;
    public TextField hobbiesPrompt;
    public Button createFriendButton;
    public ImageView image;
    public Label friendCompleted;
    public ImageView checkmark;
    public Label nameInfo;
    public Label nicknameInfo;
    public Label ageInfo;
    public Label contactInfo;
    public Label hobbiesInfo;
    public ListView<Friend> friendList = new ListView<>();
    public ArrayList<Friend> friendArrayList =  new ArrayList<>();
    public Button deleteButton;
    public Button displayFriendButton;
    public Label allFriendList1;
    public Label allFriendList2;
    public Label allFriendList3;
    public Label allFriendList4;
    public Label fullShow;
    public Tab displayFriendTab;
    public Tab friendListTab;
    public Tab createTab;
    public Button load1;
    public Button load2;
    public Button load3;
    public Button load4;
    public Button save2;
    public Button save1;
    public Button save3;
    public Button save4;
    public Label fileNumber;
    public File file;


    public void createFriend (ActionEvent actionEvent){
        String name = firstNamePrompt.getText() + " " + lastNamePrompt.getText();
        String nickname = nicknamePrompt.getText();
        String age = agePrompt.getText();
        String contact = contactPrompt.getText();
        String hobbies = hobbiesPrompt.getText();
        double a = 1.0;
        Friend one = new Friend(name, nickname, age, contact, hobbies);
        friendList.getItems().add(one);
        friendArrayList.add(one);
        firstNamePrompt.clear();
        lastNamePrompt.clear();
        agePrompt.clear();
        nicknamePrompt.clear();
        contactPrompt.clear();
        hobbiesPrompt.clear();
        image.setOpacity(a);
        checkmark.setOpacity(a);
        friendCompleted.setOpacity(a);
        createFriendButton.setDisable(true);
        friendList.setDisable(true);
        if (friendArrayList.size()>0){
            friendList.setDisable(false);
        }
    }

    public void friendCompletedGone (MouseEvent mouseEvent){
        double a = 0.0;
        image.setOpacity(a);
        checkmark.setOpacity(a);
        friendCompleted.setOpacity(a);
    }


    public void ableCreate (KeyEvent keyEvent){
        String name = firstNamePrompt.getText();
        String lastname = lastNamePrompt.getText();
        boolean isDisabled = (name.isEmpty() && lastname.isEmpty());
        createFriendButton.setDisable(isDisabled);
    }

    public void displayFriend (MouseEvent mouseEvent){
        Friend one;
        one = friendList.getSelectionModel().getSelectedItem();
        nameInfo.setText(one.getName());
        nicknameInfo.setText(one.getNickname());
        ageInfo.setText(one.getAge());
        contactInfo.setText(one.getContacts());
        hobbiesInfo.setText(one.getHobbies());
        boolean isDisable = one.equals(null);
        deleteButton.setDisable(isDisable);
    }

    public void deleteFriend (ActionEvent actionEvent){
        Friend one;
        one = friendList.getSelectionModel().getSelectedItem();
        friendList.getItems().remove(one);
        friendArrayList.remove(one);
        nameInfo.setText("");
        nicknameInfo.setText("");
        ageInfo.setText("");
        contactInfo.setText("");
        hobbiesInfo.setText("");
        deleteButton.setDisable(true);
        friendList.setDisable(true);
        if (friendArrayList.size()>0){
            friendList.setDisable(false);
        }
    }

    public void displayAllFriends(ActionEvent actionEvent){
        if (friendArrayList.size() < 18) {
            String friendList = friendArrayList.toString();
            String a = friendList.replace(",", "\n");
            String b = a.replace("]", " ");
            String c = b.replace("[", " ");
            allFriendList1.setText(c);
        } else if (friendArrayList.size() < 35){
            String friendList3 = null;
            String friendList4 = null;
            int a = friendArrayList.size();
            for(int i = 17; i<a; i++) {
                if (friendList3 == null){
                    friendList3 = friendArrayList.get(i).toString();
                } else {
                    friendList3 = friendList3 + "\n" + friendArrayList.get(i).toString();
                }
            }
            allFriendList2.setText(friendList3);
            for(int i = 0; i<17; i++) {
                if (friendList4 == null){
                    friendList4 = friendArrayList.get(i).toString();
                } else {
                    friendList4 = friendList4 + "\n" + friendArrayList.get(i).toString();
                }
            }
            allFriendList1.setText(friendList4);
        } else if (friendArrayList.size() < 52){
            String friendList2 = null;
            String friendList3 = null;
            String friendList4 = null;
            int a = friendArrayList.size();
            for(int i = 34; i<a; i++) {
                if (friendList2 == null){
                    friendList2 = friendArrayList.get(i).toString();
                } else {
                    friendList2 = friendList2 + "\n" + friendArrayList.get(i).toString();
                }
            }
            allFriendList3.setText(friendList2);
            for(int i = 17; i<34; i++) {
                if (friendList3 == null){
                    friendList3 = friendArrayList.get(i).toString();
                } else {
                    friendList3 = friendList3 + "\n" + friendArrayList.get(i).toString();
                }
            }
            allFriendList2.setText(friendList3);
            for(int i = 0; i<17; i++) {
                if (friendList4 == null){
                    friendList4 = friendArrayList.get(i).toString();
                } else {
                    friendList4 = friendList4 + "\n" + friendArrayList.get(i).toString();
                }
            }
            allFriendList1.setText(friendList4);
        } else if (friendArrayList.size() < 69){
            String friendList1 = null;
            String friendList2 = null;
            String friendList3 = null;
            String friendList4 = null;
            int a = friendArrayList.size();
            for(int i = 51; i<a; i++) {
                if (friendList1 == null){
                    friendList1 = friendArrayList.get(i).toString();
                } else {
                    friendList1 = friendList1 + "\n" + friendArrayList.get(i).toString();
                }
            }
            allFriendList4.setText(friendList1);
            for(int i = 34; i<51; i++) {
                if (friendList2 == null){
                    friendList2 = friendArrayList.get(i).toString();
                } else {
                    friendList2 = friendList2 + "\n" + friendArrayList.get(i).toString();
                }
            }
            allFriendList3.setText(friendList2);
            for(int i = 17; i<34; i++) {
                if (friendList3 == null){
                    friendList3 = friendArrayList.get(i).toString();
                } else {
                    friendList3 = friendList3 + "\n" + friendArrayList.get(i).toString();
                }
            }
            allFriendList2.setText(friendList3);
            for(int i = 0; i<17; i++) {
                if (friendList4 == null){
                    friendList4 = friendArrayList.get(i).toString();
                } else {
                    friendList4 = friendList4 + "\n" + friendArrayList.get(i).toString();
                }
            }
            allFriendList1.setText(friendList4);
        } else {
            fullShow.setText("FULL");
            String friendList1 = null;
            String friendList2 = null;
            String friendList3 = null;
            String friendList4 = null;
            for(int i = 51; i<68; i++) {
                if (friendList1 == null){
                    friendList1 = friendArrayList.get(i).toString();
                } else {
                    friendList1 = friendList1 + "\n" + friendArrayList.get(i).toString();
                }
            }
            allFriendList4.setText(friendList1);
            for(int i = 34; i<51; i++) {
                if (friendList2 == null){
                    friendList2 = friendArrayList.get(i).toString();
                } else {
                    friendList2 = friendList2 + "\n" + friendArrayList.get(i).toString();
                }
            }
            allFriendList3.setText(friendList2);
            for(int i = 17; i<34; i++) {
                if (friendList3 == null){
                    friendList3 = friendArrayList.get(i).toString();
                } else {
                    friendList3 = friendList3 + "\n" + friendArrayList.get(i).toString();
                }
            }
            allFriendList2.setText(friendList3);
            for(int i = 0; i<17; i++) {
                if (friendList4 == null){
                    friendList4 = friendArrayList.get(i).toString();
                } else {
                    friendList4 = friendList4 + "\n" + friendArrayList.get(i).toString();
                }
            }
            allFriendList1.setText(friendList4);
        }
    }

    public void ableDisplay(Event event){
        if (!friendArrayList.isEmpty()){
            displayFriendButton.setDisable(false);
        }
    }



    public void loadFile1(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        load1.setDisable(true);
        load2.setDisable(true);
        load3.setDisable(true);
        load4.setDisable(true);
        save1.setDisable(false);
        save2.setDisable(true);
        save3.setDisable(true);
        save4.setDisable(true);
        createTab.setDisable(false);
        friendListTab.setDisable(false);
        displayFriendTab.setDisable(false);
        fileNumber.setText("1");
        file = new File("FriendList1.txt");
        ArrayList<String> lines = new ArrayList<>();
        FileReader load = new FileReader(file);
        BufferedReader loading = new BufferedReader(load);
        String line;
        while((line = loading.readLine()) != null){
            lines.add(line);
        }
        for(int i=0; i<(lines.size()-4); i = i+5){
            String name = (lines.get(i)).toString();
            String nickname = (lines.get(i+1)).toString();
            String age = (lines.get(i+2)).toString();
            String contacts = (lines.get(i+3)).toString();
            String hobbies = (lines.get(i+4)).toString();
            Friend one = new Friend(name, nickname, age, contacts, hobbies);
            friendArrayList.add(one);
            friendList.getItems().add(one);
        }
        friendList.setDisable(true);
        if (friendArrayList.size()>0){
            friendList.setDisable(false);
        }

    }
    public void loadFile2(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        load1.setDisable(true);
        load2.setDisable(true);
        load3.setDisable(true);
        load4.setDisable(true);
        save1.setDisable(true);
        save2.setDisable(false);
        save3.setDisable(true);
        save4.setDisable(true);
        createTab.setDisable(false);
        friendListTab.setDisable(false);
        displayFriendTab.setDisable(false);
        fileNumber.setText("2");
        file = new File("FriendList2.txt");
        ArrayList<String> lines = new ArrayList<>();
        FileReader load = new FileReader(file);
        BufferedReader loading = new BufferedReader(load);
        String line;
        while((line = loading.readLine()) != null){
            lines.add(line);
        }
        for(int i=0; i<(lines.size()-4); i = i+5){
            String name = (lines.get(i)).toString();
            String nickname = (lines.get(i+1)).toString();
            String age = (lines.get(i+2)).toString();
            String contacts = (lines.get(i+3)).toString();
            String hobbies = (lines.get(i+4)).toString();
            Friend one = new Friend(name, nickname, age, contacts, hobbies);
            friendArrayList.add(one);
            friendList.getItems().add(one);
        }
        friendList.setDisable(true);
        if (friendArrayList.size()>0){
            friendList.setDisable(false);
        }
    }
    public void loadFile3(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        load1.setDisable(true);
        load2.setDisable(true);
        load3.setDisable(true);
        load4.setDisable(true);
        save1.setDisable(true);
        save2.setDisable(true);
        save3.setDisable(false);
        save4.setDisable(true);
        createTab.setDisable(false);
        friendListTab.setDisable(false);
        displayFriendTab.setDisable(false);
        fileNumber.setText("3");
        file = new File("FriendList3.txt");
        ArrayList<String> lines = new ArrayList<>();
        FileReader load = new FileReader(file);
        BufferedReader loading = new BufferedReader(load);
        String line;
        while((line = loading.readLine()) != null){
            lines.add(line);
        }
        for(int i=0; i<(lines.size()-4); i = i+5){
            String name = (lines.get(i)).toString();
            String nickname = (lines.get(i+1)).toString();
            String age = (lines.get(i+2)).toString();
            String contacts = (lines.get(i+3)).toString();
            String hobbies = (lines.get(i+4)).toString();
            Friend one = new Friend(name, nickname, age, contacts, hobbies);
            friendArrayList.add(one);
            friendList.getItems().add(one);
        }
        friendList.setDisable(true);
        if (friendArrayList.size()>0){
            friendList.setDisable(false);
        }
    }
    public void loadFile4(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        load1.setDisable(true);
        load2.setDisable(true);
        load3.setDisable(true);
        load4.setDisable(true);
        save1.setDisable(true);
        save2.setDisable(true);
        save3.setDisable(true);
        save4.setDisable(false);
        createTab.setDisable(false);
        friendListTab.setDisable(false);
        displayFriendTab.setDisable(false);
        fileNumber.setText("4");
        file = new File("FriendList4.txt");
        ArrayList<String> lines = new ArrayList<>();
        FileReader load = new FileReader(file);
        BufferedReader loading = new BufferedReader(load);
        String line;
        while((line = loading.readLine()) != null){
            lines.add(line);
        }
        for(int i=0; i<(lines.size()-4); i = i+5){
            String name = (lines.get(i)).toString();
            String nickname = (lines.get(i+1)).toString();
            String age = (lines.get(i+2)).toString();
            String contacts = (lines.get(i+3)).toString();
            String hobbies = (lines.get(i+4)).toString();
            Friend one = new Friend(name, nickname, age, contacts, hobbies);
            friendArrayList.add(one);
            friendList.getItems().add(one);
        }
        friendList.setDisable(true);
        if (friendArrayList.size()>0){
            friendList.setDisable(false);
        }
    }

    public void saveFile1(ActionEvent actionEvent) throws IOException {
        load1.setDisable(false);
        load2.setDisable(false);
        load3.setDisable(false);
        load4.setDisable(false);
        save1.setDisable(true);
        save2.setDisable(true);
        save3.setDisable(true);
        save4.setDisable(true);
        createTab.setDisable(true);
        friendListTab.setDisable(true);
        displayFriendTab.setDisable(true);
        file = new File("FriendList1.txt");
        FileOutputStream save = new FileOutputStream(file);
        BufferedWriter saved = new BufferedWriter(new OutputStreamWriter(save));
        for (int i = 0; i<friendArrayList.size(); i++){
            String name = (friendArrayList.get(i)).toString();
            String nickname = (friendArrayList.get(i)).getNickname();
            String age = (friendArrayList.get(i)).getAge();
            String contacts = (friendArrayList.get(i)).getContacts();
            String hobbies= (friendArrayList.get(i)).getHobbies();
            saved.write(name);
            saved.newLine();
            saved.write(nickname);
            saved.newLine();
            saved.write(age);
            saved.newLine();
            saved.write(contacts);
            saved.newLine();
            saved.write(hobbies);
            saved.newLine();
        }
        saved.close();
        friendArrayList.clear();
        friendList.getItems().clear();
        allFriendList1.setText("");
        allFriendList2.setText("");
        allFriendList3.setText("");
        allFriendList4.setText("");
        fullShow.setText("");
        nameInfo.setText("");
        nicknameInfo.setText("");
        ageInfo.setText("");
        contactInfo.setText("");
        hobbiesInfo.setText("");
    }
    public void saveFile2(ActionEvent actionEvent) throws IOException {
        load1.setDisable(false);
        load2.setDisable(false);
        load3.setDisable(false);
        load4.setDisable(false);
        save1.setDisable(true);
        save2.setDisable(true);
        save3.setDisable(true);
        save4.setDisable(true);
        createTab.setDisable(true);
        friendListTab.setDisable(true);
        displayFriendTab.setDisable(true);
        file = new File("FriendList2.txt");
        FileOutputStream save = new FileOutputStream(file);
        BufferedWriter saved = new BufferedWriter(new OutputStreamWriter(save));
        for (int i = 0; i<friendArrayList.size(); i++){
            String name = (friendArrayList.get(i)).toString();
            String nickname = (friendArrayList.get(i)).getNickname();
            String age = (friendArrayList.get(i)).getAge();
            String contacts = (friendArrayList.get(i)).getContacts();
            String hobbies= (friendArrayList.get(i)).getHobbies();
            saved.write(name);
            saved.newLine();
            saved.write(nickname);
            saved.newLine();
            saved.write(age);
            saved.newLine();
            saved.write(contacts);
            saved.newLine();
            saved.write(hobbies);
            saved.newLine();
        }
        saved.close();
        friendArrayList.clear();
        friendList.getItems().clear();
        allFriendList1.setText("");
        allFriendList2.setText("");
        allFriendList3.setText("");
        allFriendList4.setText("");
        fullShow.setText("");
        nameInfo.setText("");
        nicknameInfo.setText("");
        ageInfo.setText("");
        contactInfo.setText("");
        hobbiesInfo.setText("");
    }
    public void saveFile3(ActionEvent actionEvent) throws IOException {
        load1.setDisable(false);
        load2.setDisable(false);
        load3.setDisable(false);
        load4.setDisable(false);
        save1.setDisable(true);
        save2.setDisable(true);
        save3.setDisable(true);
        save4.setDisable(true);
        createTab.setDisable(true);
        friendListTab.setDisable(true);
        displayFriendTab.setDisable(true);
        file = new File("FriendList3.txt");
        FileOutputStream save = new FileOutputStream(file);
        BufferedWriter saved = new BufferedWriter(new OutputStreamWriter(save));
        for (int i = 0; i<friendArrayList.size(); i++){
            String name = (friendArrayList.get(i)).toString();
            String nickname = (friendArrayList.get(i)).getNickname();
            String age = (friendArrayList.get(i)).getAge();
            String contacts = (friendArrayList.get(i)).getContacts();
            String hobbies= (friendArrayList.get(i)).getHobbies();
            saved.write(name);
            saved.newLine();
            saved.write(nickname);
            saved.newLine();
            saved.write(age);
            saved.newLine();
            saved.write(contacts);
            saved.newLine();
            saved.write(hobbies);
            saved.newLine();
        }
        saved.close();
        friendArrayList.clear();
        friendList.getItems().clear();
        allFriendList1.setText("");
        allFriendList2.setText("");
        allFriendList3.setText("");
        allFriendList4.setText("");
        fullShow.setText("");
        nameInfo.setText("");
        nicknameInfo.setText("");
        ageInfo.setText("");
        contactInfo.setText("");
        hobbiesInfo.setText("");
    }
    public void saveFile4(ActionEvent actionEvent) throws IOException {
        load1.setDisable(false);
        load2.setDisable(false);
        load3.setDisable(false);
        load4.setDisable(false);
        save1.setDisable(true);
        save2.setDisable(true);
        save3.setDisable(true);
        save4.setDisable(true);
        createTab.setDisable(true);
        friendListTab.setDisable(true);
        displayFriendTab.setDisable(true);
        file = new File("FriendList4.txt");
        FileOutputStream save = new FileOutputStream(file);
        BufferedWriter saved = new BufferedWriter(new OutputStreamWriter(save));
        for (int i = 0; i<friendArrayList.size(); i++){
            String name = (friendArrayList.get(i)).toString();
            String nickname = (friendArrayList.get(i)).getNickname();
            String age = (friendArrayList.get(i)).getAge();
            String contacts = (friendArrayList.get(i)).getContacts();
            String hobbies= (friendArrayList.get(i)).getHobbies();
            saved.write(name);
            saved.newLine();
            saved.write(nickname);
            saved.newLine();
            saved.write(age);
            saved.newLine();
            saved.write(contacts);
            saved.newLine();
            saved.write(hobbies);
            saved.newLine();
        }
        saved.close();
        friendArrayList.clear();
        friendList.getItems().clear();
        allFriendList1.setText("");
        allFriendList2.setText("");
        allFriendList3.setText("");
        allFriendList4.setText("");
        fullShow.setText("");
        nameInfo.setText("");
        nicknameInfo.setText("");
        ageInfo.setText("");
        contactInfo.setText("");
        hobbiesInfo.setText("");
    }

}