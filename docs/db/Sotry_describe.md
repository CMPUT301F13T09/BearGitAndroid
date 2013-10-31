#TABLE: `STORY_INFO`

##Colnum:

###ID
desc: the id of story, use it for search read progress and others. Only function in local

###UUID
desc: this is the index of each story, which create by elastic when User upload a story. This id use for idental different stories.

###Title

###Author
desc: The author name, Author can use any name to be be author name.

###Filename
desc: This name is the filename which save the story body, it generate by md5(author + Title + Description + timestamp)

###Date
desc: Story Create time.

###Status
desc: use this value to identify story Status.

**value:**
1 :  Story body not download yet
2 :  Story already downloaded
3 :  Story is create by user and not upload. PS: after upload, this change to 2.

##CODE
```
CREATE TABLE STORY_INFO ( 
    ID          INT          PRIMARY KEY
                             NOT NULL
                             UNIQUE,
    Title       CHAR( 128 )  NOT NULL,
    Author      CHAR( 128 )  NOT NULL,
    Filename    CHAR( 32 )   NOT NULL
                             UNIQUE,
    Description TEXT,
    Date        DATETIME     NOT NULL,
    Status      INT( 1 )     NOT NULL 
);
```


#TABLE `READ_PROCESS`

##COLNUM

###sid
desc: forbidenkey of id in table `STORY_INFO` 

###Lasttime
desc: lasttime of read this process

###Data
desc: the process data, formate should be X:X:X .......... default is 1

###Finish
desc: if finish read a story, change this to 1, otherwise it is 0.


##CODE
```
CREATE TABLE READ_PROCESS ( 
    sid      INT       NOT NULL
                       REFERENCES STORY_INFO ( ID ),
    Lasttime DATETIME  NOT NULL,
    Data     TEXT      NOT NULL,
    Finish   INT( 1 )  NOT NULL
                       DEFAULT ( 0 ) 
);
```
