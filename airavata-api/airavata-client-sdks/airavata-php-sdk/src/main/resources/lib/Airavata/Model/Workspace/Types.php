<?php
namespace Airavata\Model\Workspace;

/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;


class Group {
  static $_TSPEC;

  /**
   * @var string
   */
  public $groupName = null;
  /**
   * @var string
   */
  public $description = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'groupName',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'description',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['groupName'])) {
        $this->groupName = $vals['groupName'];
      }
      if (isset($vals['description'])) {
        $this->description = $vals['description'];
      }
    }
  }

  public function getName() {
    return 'Group';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->groupName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->description);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('Group');
    if ($this->groupName !== null) {
      $xfer += $output->writeFieldBegin('groupName', TType::STRING, 1);
      $xfer += $output->writeString($this->groupName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->description !== null) {
      $xfer += $output->writeFieldBegin('description', TType::STRING, 2);
      $xfer += $output->writeString($this->description);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class Project {
  static $_TSPEC;

  /**
   * @var string
   */
  public $projectID = "DO_NOT_SET_AT_CLIENTS";
  /**
   * @var string
   */
  public $owner = null;
  /**
   * @var string
   */
  public $name = null;
  /**
   * @var string
   */
  public $description = null;
  /**
   * @var int
   */
  public $creationTime = null;
  /**
   * @var string[]
   */
  public $sharedUsers = null;
  /**
   * @var string[]
   */
  public $sharedGroups = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'projectID',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'owner',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'name',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'description',
          'type' => TType::STRING,
          ),
        5 => array(
          'var' => 'creationTime',
          'type' => TType::I64,
          ),
        6 => array(
          'var' => 'sharedUsers',
          'type' => TType::LST,
          'etype' => TType::STRING,
          'elem' => array(
            'type' => TType::STRING,
            ),
          ),
        7 => array(
          'var' => 'sharedGroups',
          'type' => TType::LST,
          'etype' => TType::STRING,
          'elem' => array(
            'type' => TType::STRING,
            ),
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['projectID'])) {
        $this->projectID = $vals['projectID'];
      }
      if (isset($vals['owner'])) {
        $this->owner = $vals['owner'];
      }
      if (isset($vals['name'])) {
        $this->name = $vals['name'];
      }
      if (isset($vals['description'])) {
        $this->description = $vals['description'];
      }
      if (isset($vals['creationTime'])) {
        $this->creationTime = $vals['creationTime'];
      }
      if (isset($vals['sharedUsers'])) {
        $this->sharedUsers = $vals['sharedUsers'];
      }
      if (isset($vals['sharedGroups'])) {
        $this->sharedGroups = $vals['sharedGroups'];
      }
    }
  }

  public function getName() {
    return 'Project';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->projectID);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->owner);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->name);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->description);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->creationTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::LST) {
            $this->sharedUsers = array();
            $_size0 = 0;
            $_etype3 = 0;
            $xfer += $input->readListBegin($_etype3, $_size0);
            for ($_i4 = 0; $_i4 < $_size0; ++$_i4)
            {
              $elem5 = null;
              $xfer += $input->readString($elem5);
              $this->sharedUsers []= $elem5;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 7:
          if ($ftype == TType::LST) {
            $this->sharedGroups = array();
            $_size6 = 0;
            $_etype9 = 0;
            $xfer += $input->readListBegin($_etype9, $_size6);
            for ($_i10 = 0; $_i10 < $_size6; ++$_i10)
            {
              $elem11 = null;
              $xfer += $input->readString($elem11);
              $this->sharedGroups []= $elem11;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('Project');
    if ($this->projectID !== null) {
      $xfer += $output->writeFieldBegin('projectID', TType::STRING, 1);
      $xfer += $output->writeString($this->projectID);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->owner !== null) {
      $xfer += $output->writeFieldBegin('owner', TType::STRING, 2);
      $xfer += $output->writeString($this->owner);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->name !== null) {
      $xfer += $output->writeFieldBegin('name', TType::STRING, 3);
      $xfer += $output->writeString($this->name);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->description !== null) {
      $xfer += $output->writeFieldBegin('description', TType::STRING, 4);
      $xfer += $output->writeString($this->description);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->creationTime !== null) {
      $xfer += $output->writeFieldBegin('creationTime', TType::I64, 5);
      $xfer += $output->writeI64($this->creationTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->sharedUsers !== null) {
      if (!is_array($this->sharedUsers)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('sharedUsers', TType::LST, 6);
      {
        $output->writeListBegin(TType::STRING, count($this->sharedUsers));
        {
          foreach ($this->sharedUsers as $iter12)
          {
            $xfer += $output->writeString($iter12);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    if ($this->sharedGroups !== null) {
      if (!is_array($this->sharedGroups)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('sharedGroups', TType::LST, 7);
      {
        $output->writeListBegin(TType::STRING, count($this->sharedGroups));
        {
          foreach ($this->sharedGroups as $iter13)
          {
            $xfer += $output->writeString($iter13);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class User {
  static $_TSPEC;

  /**
   * @var string
   */
  public $userName = null;
  /**
   * @var \Airavata\Model\Workspace\Group[]
   */
  public $groupList = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'userName',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'groupList',
          'type' => TType::LST,
          'etype' => TType::STRUCT,
          'elem' => array(
            'type' => TType::STRUCT,
            'class' => '\Airavata\Model\Workspace\Group',
            ),
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['userName'])) {
        $this->userName = $vals['userName'];
      }
      if (isset($vals['groupList'])) {
        $this->groupList = $vals['groupList'];
      }
    }
  }

  public function getName() {
    return 'User';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->userName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::LST) {
            $this->groupList = array();
            $_size14 = 0;
            $_etype17 = 0;
            $xfer += $input->readListBegin($_etype17, $_size14);
            for ($_i18 = 0; $_i18 < $_size14; ++$_i18)
            {
              $elem19 = null;
              $elem19 = new \Airavata\Model\Workspace\Group();
              $xfer += $elem19->read($input);
              $this->groupList []= $elem19;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('User');
    if ($this->userName !== null) {
      $xfer += $output->writeFieldBegin('userName', TType::STRING, 1);
      $xfer += $output->writeString($this->userName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->groupList !== null) {
      if (!is_array($this->groupList)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('groupList', TType::LST, 2);
      {
        $output->writeListBegin(TType::STRUCT, count($this->groupList));
        {
          foreach ($this->groupList as $iter20)
          {
            $xfer += $iter20->write($output);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class Gateway {
  static $_TSPEC;

  /**
   * @var string
   */
  public $gatewayId = null;
  /**
   * @var string
   */
  public $gatewayName = null;
  /**
   * @var string
   */
  public $domain = null;
  /**
   * @var string
   */
  public $emailAddress = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'gatewayId',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'gatewayName',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'domain',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'emailAddress',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['gatewayId'])) {
        $this->gatewayId = $vals['gatewayId'];
      }
      if (isset($vals['gatewayName'])) {
        $this->gatewayName = $vals['gatewayName'];
      }
      if (isset($vals['domain'])) {
        $this->domain = $vals['domain'];
      }
      if (isset($vals['emailAddress'])) {
        $this->emailAddress = $vals['emailAddress'];
      }
    }
  }

  public function getName() {
    return 'Gateway';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->gatewayId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->gatewayName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->domain);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->emailAddress);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('Gateway');
    if ($this->gatewayId !== null) {
      $xfer += $output->writeFieldBegin('gatewayId', TType::STRING, 1);
      $xfer += $output->writeString($this->gatewayId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->gatewayName !== null) {
      $xfer += $output->writeFieldBegin('gatewayName', TType::STRING, 2);
      $xfer += $output->writeString($this->gatewayName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->domain !== null) {
      $xfer += $output->writeFieldBegin('domain', TType::STRING, 3);
      $xfer += $output->writeString($this->domain);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->emailAddress !== null) {
      $xfer += $output->writeFieldBegin('emailAddress', TType::STRING, 4);
      $xfer += $output->writeString($this->emailAddress);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}


