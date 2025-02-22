# Copyright (c) Alibaba, Inc. and its affiliates.

# docstyle-ignore
AUDIO_IMPORT_ERROR = """
Audio model import failed: {0}, if you want to use audio releated function, please execute
`pip install modelscope[audio] -f https://modelscope.oss-cn-beijing.aliyuncs.com/releases/repo.html`
"""

# docstyle-ignore
PROTOBUF_IMPORT_ERROR = """
{0} requires the protobuf library but it was not found in your environment. Checkout the instructions on the
installation page of its repo: https://github.com/protocolbuffers/protobuf/tree/master/python#installation and
follow the ones that match your environment.
"""

# docstyle-ignore
SENTENCEPIECE_IMPORT_ERROR = """
{0} requires the SentencePiece library but it was not found in your environment. Checkout the instructions on the
installation page of its repo: https://github.com/google/sentencepiece#installation and follow the ones
that match your environment.
"""

# docstyle-ignore
SKLEARN_IMPORT_ERROR = """
{0} requires the scikit-learn library but it was not found in your environment. You can install it with:
```
pip install -U scikit-learn
```
In a notebook or a colab, you can install it by executing a cell with
```
!pip install -U scikit-learn
```
"""

# docstyle-ignore
TENSORFLOW_IMPORT_ERROR = """
{0} requires the TensorFlow library but it was not found in your environment. Checkout the instructions on the
installation page: https://www.tensorflow.org/install and follow the ones that match your environment.
"""

# docstyle-ignore
TENSORFLOW_IMPORT_WARNING = """
{0} requires the TensorFlow library but it was not found in your environment.
If you don't want to use them, please ignore this message
If you want to use them, please Checkout the instructions on the
installation page: https://www.tensorflow.org/install and follow the ones that match your environment.
"""

# docstyle-ignore
TIMM_IMPORT_ERROR = """
{0} requires the timm library but it was not found in your environment. You can install it with pip:
`pip install timm`
"""

# docstyle-ignore
TOKENIZERS_IMPORT_ERROR = """
{0} requires the 🤗 Tokenizers library but it was not found in your environment. You can install it with:
```
pip install tokenizers
```
In a notebook or a colab, you can install it by executing a cell with
```
!pip install tokenizers
```
"""

# docstyle-ignore
PYTORCH_IMPORT_ERROR = """
{0} requires the PyTorch library but it was not found in your environment. Checkout the instructions on the
installation page: https://pytorch.org/get-started/locally/ and follow the ones that match your environment.
"""

# docstyle-ignore
SCIPY_IMPORT_ERROR = """
{0} requires the scipy library but it was not found in your environment. You can install it with pip:
`pip install scipy`
"""

# docstyle-ignore
OPENCV_IMPORT_ERROR = """
{0} requires the opencv library but it was not found in your environment. You can install it with pip:
`pip install opencv-python`
"""

PILLOW_IMPORT_ERROR = """
{0} requires the Pillow library but it was not found in your environment. You can install it with pip:
`pip install Pillow`
"""

GENERAL_IMPORT_ERROR = """
{0} requires the REQ library but it was not found in your environment. You can install it with pip:
`pip install REQ`
"""

DECORD_IMPORT_ERROR = """
{0} requires the decord library but it was not found in your environment. You can install it with pip:
`pip install decord>=0.6.0`
"""

# docstyle-ignore
DEEPSPEED_IMPORT_ERROR = """
{0} requires the Deepspeed library but it was not found in your environment. Checkout the instructions on the
installation page: https://www.deepspeed.ai/tutorials/advanced-install/ and follow the ones that match your environment.
"""

# docstyle-ignore
FAIRSEQ_IMPORT_ERROR = """
{0} requires the fairseq library but it was not found in your environment.
You can install it with pip on linux:
`pip install fairseq`
On windows, please checkout the instructions on the
installation page: https://github.com/facebookresearch/fairseq and follow the ones that match your environment.
"""

# docstyle-ignore
FASTTEXT_IMPORT_ERROR = """
{0} requires the fasttext library but it was not found in your environment.
You can install it with pip on linux or mac:
`pip install fasttext`
Or you can checkout the instructions on the
installation page: https://github.com/facebookresearch/fastText and follow the ones that match your environment.
"""
